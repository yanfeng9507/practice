package cn.xiaoyanol.practice.spider.utils;

import cn.xiaoyanol.practice.spider.dao.ISpiderImagesDAO;
import cn.xiaoyanol.practice.spider.dao.ISpiderImagesUrlDAO;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrl;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrlExample;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-28
 * @Time: 下午2:24
 */
public class DownloadImageUtils {

    public static final String dirPrefix = "images_";

    public static void downLoadPicture(ISpiderImagesDAO imagesDAO, ISpiderImagesUrlDAO imagesUrlDAO, String absPath) throws Exception{

        absPath = "/Users/admin/Desktop/personal/images";

        File file = new File(absPath);
        // 不存在则创建文件夹
        if (!file.exists()) {
            file.mkdir();
        }

        List<SpiderImagesUrl> spiderImagesUrls = imagesUrlDAO.selectByExample(new SpiderImagesUrlExample());

        for (SpiderImagesUrl spiderImagesUrl : spiderImagesUrls) {

            try {

                Long imagesId = spiderImagesUrl.getImagesId();

                String currentDirName = absPath + "/" + dirPrefix + imagesId;
                File file1 = new File(currentDirName);
                if (!file1.exists()) {
                    file1.mkdir();
                }
                // 获取当前图集下所有文件
                File[] fileList = file1.listFiles();
                Map<String, File> fileMap = getFileMap(fileList);

                String imageSuffix = ImagesObjectUtils.getImageSuffix(spiderImagesUrl.getUrl());

                // 获取图片名
                String fileName = spiderImagesUrl.getNo() + imageSuffix;

                if (fileMap.containsKey(fileName)) {
                    continue;
                }

                HttpClient httpClient = HttpClientBuilder.create().build();
                HttpClientContext context = HttpClientContext.create();
                //设置请求和传输超时时间
                RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
                HttpGet httpGet = new HttpGet(spiderImagesUrl.getUrl());

                //设置默认请求头
                httpGet.setHeader("referer", spiderImagesUrl.getReferUrl());
                httpGet.setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
                httpGet.setConfig(requestConfig);

                //执行HTTP请求
                HttpResponse response = httpClient.execute(httpGet, context);
                System.out.println("HTTP请求执行完成。。。");

                HttpEntity entity = response.getEntity();

                //得到图片的二进制数据，以二进制封装得到数据，具有通用性
                byte[] data = readInputStream(entity.getContent());


                File imageFile = new File(currentDirName + "/" + fileName);
                //创建输出流
                FileOutputStream outStream = new FileOutputStream(imageFile);
                //写入数据
                outStream.write(data);
                //关闭输出流
                outStream.close();
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("下载图片出现错误");
            }

        }


    }

    public static Map<String, File> getFileMap(File[] files) {
        Map<String, File> map = new HashMap<>();
        files = Optional.of(files).orElse(new File[0]);
        for (File file : files) {
            map.put(file.getName(), file);
        }
        return map;
    }


    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while( (len=inStream.read(buffer)) != -1 ){
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        //把outStream里的数据写入内存
        return outStream.toByteArray();
    }
}
