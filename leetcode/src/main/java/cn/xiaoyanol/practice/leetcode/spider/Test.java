package cn.xiaoyanol.practice.leetcode.spider;

//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpStatus;
//import org.apache.http.StatusLine;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.protocol.HttpClientContext;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.util.EntityUtils;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.*;
//import java.net.URI;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-27
 * @Time: 下午7:30
 */
public class Test {
//    public static void main(String[] args) throws IOException {
//
//
//        String url = "https://www.meitulu.com/t/nvshen/";
//
//
//        HttpClient httpClient = HttpClientBuilder.create().build();
//        HttpClientContext context = HttpClientContext.create();
//        //设置请求和传输超时时间
//        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).build();
//
//        HttpGet httpGet = new HttpGet(url);
//        //设置默认请求头
////        setHttpHeaders(httpGet);
////        httpGet.setHeader(":authority", "www.meitulu.com");
//
//        httpGet.setHeader(":method", "GET");
//        httpGet.setHeader(":path", "/t/nvshen/");
//        httpGet.setHeader(":scheme", "https");
//        httpGet.setHeader("accept", "text/html,application/xhtml+xml,application/xml;;charset=utf-8;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
//        httpGet.setHeader("accept-encoding", "gzip, deflate, br");
//        httpGet.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
//        httpGet.setHeader("Cookie", "UM_distinctid=16c331bb37316d-0c66a9cdaf1429-37637c04-13c680-16c331bb375924; CNZZDATA1255357127=434723119-1564225506-%7C1564225506; __tins__3892343=%7B%22sid%22%3A%201564225657743%2C%20%22vd%22%3A%201%2C%20%22expires%22%3A%201564227457743%7D; __51cke__=; __51laig__=1");
////        httpGet.setHeader("Connection", "keep-alive");
////        httpGet.setHeader("Host", "www.tianyancha.com");
////        httpGet.setHeader("Referer", "https://www.meitulu.com/t/youwu/");
//        httpGet.setHeader("Upgrade-Insecure-Requests", "1");
////        httpGet.setHeader("if-none-match", "e057-58e88e811c203-gzip");
//        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
//        httpGet.setConfig(requestConfig);
//
//        //执行HTTP请求
//        HttpResponse response = httpClient.execute(httpGet, context);
//        System.out.println("HTTP请求执行完成。。。");
//
//        HttpEntity entity = response.getEntity();
//
//        //从搜索页面中提取目标详细信息的URL
//        if (entity != null) {
//
//            //将实体的内容转换为字符串
//            String html = EntityUtils.toString(entity, "UTF-8");
//            Document document = Jsoup.parse(html);
//            Elements elements = document.getElementsByClass("img");
//            Elements rows = elements.select("li");
//
//            for (int i = 0; i < rows.size(); i++) {
//                Elements allElements = rows.get(i).getAllElements();
//                // 图片详情url
//                String imagesUrl = allElements.get(1).attr("abs:href").toString();
//                System.out.println(document);
//            }
//
//
//        }
//    }
}
