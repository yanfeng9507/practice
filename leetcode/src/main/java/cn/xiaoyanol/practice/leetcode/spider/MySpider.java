package cn.xiaoyanol.practice.leetcode.spider;
//
//import org.jsoup.select.Elements;
//import us.codecraft.webmagic.Page;
//import us.codecraft.webmagic.Site;
//import us.codecraft.webmagic.Spider;
//import us.codecraft.webmagic.pipeline.ConsolePipeline;
//import us.codecraft.webmagic.processor.PageProcessor;
//import us.codecraft.webmagic.selector.Html;
//import us.codecraft.webmagic.selector.Selectable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-26
 * @Time: 下午7:54
 */
public class MySpider { //implements PageProcessor {

//    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
//    private Site site = Site
//            .me()
//            .setRetryTimes(3)
//            .setSleepTime(1000)
//            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Safari/537.36");
//
//    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
//    @Override
//    public void process(Page page) {
//
//        System.out.println(page);
//
//        Html html = new Html(page.getRawText());
//        Elements boxs = html.getDocument().body().getElementsByClass("boxs");
//        Selectable links = html.links();
//        for (String imgUrl : links.all()) {
//            if (imgUrl.endsWith(".jpg")|| imgUrl.endsWith(".jpeg")) {
//                System.out.println(imgUrl);
//            }
//        }
//
//        // 部分三：从页面发现后续的url地址来抓取
//        page.addTargetRequests(page.getHtml().links().regex("(http://699pic.com/yanhua*").all());
//    }
//
//    @Override
//    public Site getSite() {
//        return site;
//    }
//
//    public static void main(String[] args) {
//        Spider.create(new MySpider()).addUrl("https://www.meitulu.com/t/nvshen/")
//                .addPipeline(new ConsolePipeline()).run();
//    }
}
