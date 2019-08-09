package cn.xiaoyanol.practice.design.pattern.downloader;

import cn.xiaoyanol.practice.design.pattern.response.Response;
import cn.xiaoyanol.practice.design.pattern.utils.HttpClientUtils;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.poi.util.IOUtils;

import java.io.FileOutputStream;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-31
 * @Time: 上午11:01
 */
@Slf4j
public class HttpClientDownloader extends AbstractDownloader {


    public HttpClientDownloader(List<Request> handling, List<Response> result, int threads) {
        super(handling, result, threads);
    }



    @Override
    public Future<Response> download(Request request){
        Future<Response> submit = getExecutorService().submit(new Callable<Response>() {
            @Override
            public Response call() throws Exception {

                try {

                    // HttpClient 抽取 todo 配置

//                    HttpClient httpClient = HttpClientBuilder.create().build();
//                    HttpClientContext context = HttpClientContext.create();
                    //设置请求和传输超时时间
//                    RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();


                    Map<String, String> headers = new HashMap<>();

                    headers.put("referer", "https://www.wuhan2019mwg.cn/html/jcsp/xcp/2019/0712/99.html");
                    headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");

                    //执行HTTP请求
                    CloseableHttpResponse response = HttpClientUtils.doGet(request.getUrl(), headers, null);

                    log.info("执行http请求完成: {}", JSON.toJSONString(response));


                    byte[] bytes = IOUtils.toByteArray(response.getEntity().getContent());

                    Response res = new Response(bytes);

                    // 删除 请求任务
                    Iterator<Request> iterator = getHandling().iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().equals(request)) {
                            iterator.remove();
                        }
                    }

                    // 删除重试
                    getRetryMap().remove(request);

                    // 添加 响应结果
                    getResult().add(res);

                    // 返回结果
                    return res;

                } catch (Exception e) {
                    e.printStackTrace();
                    // 重试
                    Integer count = Optional.ofNullable(getRetryMap().get(request)).orElse(0);
                    // todo 重试次数可配置
                    if (count == 3) {
                        getRetryMap().remove(request);
                    }else {
                        count++;
                        getRetryMap().put(request, count);
                        download(request);
                    }

                    log.error("执行下载任务出现异常: {}", e.getMessage());
                }
                return null;
            }
        });
        return submit;
    }

    public static void main(String[] args) throws Throwable {
        HttpClientDownloader httpClientDownloader = new HttpClientDownloader(new ArrayList<>(100), new ArrayList<>(10), 3);
//        Future<Response> download = httpClientDownloader.download(new Request("http://f.us.sinaimg.cn/004AVWlDlx07vgt7ht3G01041202IJH30E010.mp4?label=mp4_720p&template=1280x720.23.0&Expires=1564663124&ssig=gU3Im%2B1Wn7&KID=unistore,video"));


        Map<String, String> headers = new HashMap<>();

        headers.put("referer", "https://www.wuhan2019mwg.cn/html/jcsp/xcp/2019/0712/99.html");
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");

        CloseableHttpResponse response = HttpClientUtils.doGet("https://vod.wuhan2019mwg.cn/9a9677192eaa49f7b1e5519ae04babbc/f8b0f0afc6a84aae94af873fa53b784e-bd9aca42b3d123167f176ad8b940fa63-hd.mp4", headers, null);

        FileOutputStream fileOutputStream = new FileOutputStream("test.mp4");

        byte[] buffer = new byte[4096];

        int read = 0;

        while(read != -1) {
            read = response.getEntity().getContent().read(buffer);
            if(read > 0) {
                fileOutputStream.write(buffer, 0, read);
            }
        }
        fileOutputStream.close();

        httpClientDownloader.getExecutorService().shutdown();
    }


}
