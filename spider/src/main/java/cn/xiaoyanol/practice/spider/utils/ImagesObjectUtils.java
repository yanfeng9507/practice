package cn.xiaoyanol.practice.spider.utils;

import cn.xiaoyanol.practice.spider.dao.ISpiderImagesDAO;
import cn.xiaoyanol.practice.spider.dao.ISpiderImagesUrlDAO;
import cn.xiaoyanol.practice.spider.domain.SpiderImages;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesExample;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrl;
import cn.xiaoyanol.practice.spider.domain.SpiderImagesUrlExample;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-28
 * @Time: 下午2:59
 */
public class ImagesObjectUtils {

    public static void doGetImagesUrl(ISpiderImagesDAO imagesDAO, ISpiderImagesUrlDAO imagesUrlDAO) throws IOException {

        // 获取当前所有图集
        List<SpiderImages> images = imagesDAO.selectByExample(new SpiderImagesExample());

        // 获取当前所有图片url
        List<SpiderImagesUrl> spiderImagesUrls = imagesUrlDAO.selectByExample(new SpiderImagesUrlExample());

        // 将imagesUrl列表转为map方便去重
        Map<String, SpiderImagesUrl> spiderImagesUrlMap = getSpiderImagesUrlMap(spiderImagesUrls);

        // 遍历请求
        for (SpiderImages spiderImages : images) {

            // 图集url
            String url = spiderImages.getUrl();
            if (StringUtils.isBlank(url)) {
                continue;
            }

            // 不等于0 说明已经查询过
            if (spiderImages.getTotal() != 0) {
                continue;
            }

            try {

                HttpClient httpClient = HttpClientBuilder.create().build();
                HttpClientContext context = HttpClientContext.create();
                //设置请求和传输超时时间
                RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
                HttpGet httpGet = new HttpGet(url);

                //设置默认请求头
                httpGet.setHeader(":method", "GET");
                httpGet.setHeader(":scheme", "https");
                httpGet.setHeader("referer", spiderImages.getUrl());
                httpGet.setHeader("accept", "text/html,application/xhtml+xml,application/xml;;charset=utf-8;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
                httpGet.setHeader("accept-encoding", "gzip, deflate, br");
                httpGet.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
                httpGet.setHeader("Cookie", "UM_distinctid=16c36ccba5316d-027e27ad16d33e-37637c04-13c680-16c36ccba55750; CNZZDATA1255357127=1326211500-1564284933-%7C1564284933");
                httpGet.setHeader("Upgrade-Insecure-Requests", "1");
                httpGet.setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
                httpGet.setConfig(requestConfig);

                //执行HTTP请求
                HttpResponse response = httpClient.execute(httpGet, context);
                System.out.println("HTTP请求执行完成。。。");

                HttpEntity entity = response.getEntity();

                //获取图片url
                if (entity != null) {

                    //将实体的内容转换为字符串
                    String html = EntityUtils.toString(entity, "UTF-8");
                    Document document = Jsoup.parse(html);

                    //获取对象
                    SpiderImages imageObject = getImageObject(document, imagesDAO, spiderImages);

                    String firstImagesUrl = getFirstImagesUrl(document);

                    // 获取图片的后缀
                    String imageSuffix = getImageSuffix(firstImagesUrl);

                    //保存imagesUrl到数据库
                    saveImagesUrl(imagesUrlDAO, spiderImagesUrlMap, imageObject, firstImagesUrl, imageSuffix);
                }
                Thread.sleep(200);

            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("获取图片url出现异常");
            }
        }
    }

    /**
     * 保存imagesUrl到数据库
     * @param imagesUrlDAO
     * @param spiderImagesUrlMap
     * @param imageObject
     * @param firstImagesUrl
     * @param imageSuffix
     */
    private static void saveImagesUrl(ISpiderImagesUrlDAO imagesUrlDAO, Map<String, SpiderImagesUrl> spiderImagesUrlMap, SpiderImages imageObject, String firstImagesUrl, String imageSuffix) {
        // 生成图片url
        for (int i = 1; i < imageObject.getTotal() + 1; i++) {
            String s = generateImagesUrl(firstImagesUrl, i, imageSuffix);

            // 如果有重复的，跳过
            if (spiderImagesUrlMap.containsKey(s)) {
                continue;
            }
            SpiderImagesUrl spiderImagesUrl = new SpiderImagesUrl();
            spiderImagesUrl.setImagesId(imageObject.getId());
            spiderImagesUrl.setNo(i);
            spiderImagesUrl.setUrl(s);
            spiderImagesUrl.setReferUrl(imageObject.getUrl());

            imagesUrlDAO.insertSelective(spiderImagesUrl);
        }
    }


    /**
     * 自动生成图片的路径
     * @param firstImagesUrl
     * @param currentImages
     * @param imageSuffix
     * @return
     */
    private static String generateImagesUrl(String firstImagesUrl, int currentImages, String imageSuffix) {
        int indexOf = firstImagesUrl.lastIndexOf("/");
        String s = firstImagesUrl.substring(0, indexOf) + "/"+currentImages + imageSuffix;
        return s;
    }


    /**
     * 获取第一张图片的url
     * @param document
     * @return
     */
    private static String getFirstImagesUrl(Document document) {
        Elements elementsByTag = document.getElementsByTag("center").get(0).getElementsByTag("img");
        String imagesUrl  = elementsByTag.get(0).attr("src");
        return imagesUrl;
    }

    /**
     * 获取图片后缀
     * @param imageUrl
     * @return
     */
    public static String getImageSuffix(String imageUrl) {
        if (StringUtils.isBlank(imageUrl)) {
            return "";
        }
        int indexOf = imageUrl.lastIndexOf('.');
        return imageUrl.substring(indexOf);

    }


    /**
     * 从document对象中解析images对象
     * @param document
     * @param imagesDAO
     * @param spiderImages
     */
    public static SpiderImages getImageObject(Document document, ISpiderImagesDAO imagesDAO, SpiderImages spiderImages) {

        if (document == null || imagesDAO == null || spiderImages == null) {
            System.out.println("参数错误:{}");
            return spiderImages;
        }


        //  发行机构 issuer
        String issuer = null;
        try {
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("机构")) {
                    issuer = element.text();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取发行机构出现异常");
        }

        //  期刊编号 numbers
        String numbers = null;
        try {
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("号")) {
                    numbers = element.text();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取期刊编号出现异常");
        }

        // 图片数量 total
        int imageTotal = 0;
        try {

            String imagesTotalString = document.getElementsByTag("p").get(2).text();
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("片数")) {
                    imagesTotalString = element.text();
                    break;
                }
            }
            String[] split = imagesTotalString.split(" ");
            imageTotal = Integer.parseInt(split[1]);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取图片数量出现异常");
        }

        // 分辨率 resolving_power
        String resolvingPower = null;
        try {
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("辨")) {
                    resolvingPower = element.text();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取分辨率出现异常");
        }

        // name 模特名称
        String name = null;
        try {
            name = document.getElementsByTag("p").get(4).text();
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("姓名")) {
                    name = element.text();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取模特姓名出现异常");
        }
        // 防止名字被洗掉
        if (StringUtils.isBlank(name)) {
            name = null;
        }

        // 发行时间 publish_time
        String publishTime = null;
        try {
            publishTime = document.getElementsByTag("p").get(5).text();
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("时间")) {
                    publishTime = element.text();
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取发行时间出现异常");
        }


        // 备注 remarks 模特url
        String remarks = null;
        try {

            remarks = document.getElementsByTag("p").get(6).text();
            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("说明")) {
                    remarks = element.text();
                    break;
                }
            }
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("获取备注出现异常");
        }

        String attr = null;
        try {

            Elements p = document.getElementsByTag("p");
            for (Element element : p) {
                if (element.text().contains("姓名")) {
                    attr = element.getElementsByTag("a").attr("abs:href");
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("获取模特个人页面出现异常");
        }
        remarks +=  " - " +attr;

        spiderImages.setIssuer(issuer);
        spiderImages.setNumbers(numbers);
        spiderImages.setTotal(imageTotal);
        spiderImages.setResolvingPower(resolvingPower);
        spiderImages.setName(name);
        spiderImages.setPublishTime(publishTime);
        spiderImages.setRemarks(remarks);

        // 更新images对象
        imagesDAO.updateByPrimaryKeySelective(spiderImages);
        return spiderImages;
    }


    /**
     * 将imagesUrl列表转为map方便去重
     * @param spiderImagesUrls
     * @return
     */
    public static Map<String, SpiderImagesUrl> getSpiderImagesUrlMap(List<SpiderImagesUrl> spiderImagesUrls) {
        Map<String, SpiderImagesUrl> map = new HashMap<>();

        spiderImagesUrls = Optional.of(spiderImagesUrls).orElse(new ArrayList<>());

        for (SpiderImagesUrl spiderImagesUrl : spiderImagesUrls) {
            map.put(spiderImagesUrl.getUrl(), spiderImagesUrl);
        }
        return map;
    }

}
