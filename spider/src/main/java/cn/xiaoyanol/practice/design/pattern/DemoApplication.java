package cn.xiaoyanol.practice.design.pattern;

import cn.xiaoyanol.practice.design.pattern.domain.SpiderCategoryExample;
import cn.xiaoyanol.practice.design.pattern.dao.ISpiderCategoryDAO;
import cn.xiaoyanol.practice.design.pattern.dao.ISpiderImagesDAO;
import cn.xiaoyanol.practice.design.pattern.dao.ISpiderImagesUrlDAO;
import cn.xiaoyanol.practice.design.pattern.dao.ISpiderTagDAO;
import cn.xiaoyanol.practice.design.pattern.domain.SpiderCategory;
import cn.xiaoyanol.practice.design.pattern.domain.SpiderImages;
import cn.xiaoyanol.practice.design.pattern.domain.SpiderImagesExample;
import cn.xiaoyanol.practice.design.pattern.utils.DownloadImageUtils;
import cn.xiaoyanol.practice.design.pattern.utils.ImagesObjectUtils;
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
import org.jsoup.select.Elements;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.*;

@Configuration
@MapperScan(basePackages = {"cn.xiaoyanol.practice.spider.dao"})
@ComponentScan(basePackages = "cn.xiaoyanol.practice.spider")
@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ISpiderCategoryDAO categoryDAO;

	@Autowired
	private ISpiderImagesDAO imagesDAO;

	@Autowired
	private ISpiderImagesUrlDAO imagesUrlDAO;

	@Autowired
	private ISpiderTagDAO tagDAO;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		getCategory();
//		getImagesUrl();
		DownloadImageUtils.downLoadPicture(imagesDAO, imagesUrlDAO, "");
	}


	private void getCategory() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				doGetCategory();
			}
		});
		thread.start();
	}

	private void doGetCategory() {


		// 获取所有分类
		List<SpiderCategory> categories = categoryDAO.selectByExample(new SpiderCategoryExample());
		// 获取当前所有图集
		List<SpiderImages> images = imagesDAO.selectByExample(new SpiderImagesExample());
		Map<String, SpiderImages> imagesMap = getImagesMap(images);


		// 循环搜索分类
		for (SpiderCategory spiderCategory : categories) {
			if (spiderCategory.getId() != 17) {
 				continue;
			}
			int  repeat = 0;
			int currentPage = 0;
			int total = 0;
			while (true) {
				try {
					currentPage++;

					String categoryUrl = spiderCategory.getCategoryUrl();
					if (currentPage != 1) {
						categoryUrl += currentPage+".html";
					}

					HttpClient httpClient = HttpClientBuilder.create().build();
					HttpClientContext context = HttpClientContext.create();
					//设置请求和传输超时时间
					RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).build();
					HttpGet httpGet = new HttpGet(categoryUrl);

					//设置默认请求头
					httpGet.setHeader(":method", "GET");
					httpGet.setHeader(":path", "/t/" + spiderCategory.getCategory() + "/");
					httpGet.setHeader(":scheme", "https");
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

					//从搜索页面中提取目标详细信息的URL
					if (entity != null) {

						//将实体的内容转换为字符串
						String html = EntityUtils.toString(entity, "UTF-8");
						Document document = Jsoup.parse(html);
						Elements elements = document.getElementsByClass("img");
						Elements rows = elements.select("li");

						for (int i = 0; i < rows.size(); i++) {
							Elements allElements = rows.get(i).getAllElements();
							// 图片详情url
							String imagesUrl = allElements.get(1).attr("abs:href").toString();
							String name = "";
							try {
								String text = "" + allElements.get(6).text();
								String[] split = text.split("：");
							 name =split.length > 0 ? split[1] : "";
							}catch (Exception e) {}

							if (total == 0) {
								// 获取总页数
								try {
									if (document.getElementById("pages").getAllElements().size() == 1) {
										total = 0;
									}else {
										String pages = document.getElementById("pages").getAllElements().get(13).text();
										total = Integer.parseInt(pages);
									}
								}catch (Exception e) {
									try {

										String pages = document.getElementById("pages").getAllElements().get(12).text();
										total = Integer.parseInt(pages);
									}catch (Exception e2) {
										String pages = document.getElementById("pages").getAllElements().get(11).text();
										total = Integer.parseInt(pages);
									}
								}

							}

							if (imagesMap.containsKey(imagesUrl)) {
								SpiderImages spiderImages = imagesMap.get(imagesUrl);
								if (spiderImages.getCategoryId() != spiderCategory.getId()) {
									repeat++;
									System.out.println("类别不一样，url一样: "+repeat);
								}
								continue;
							}

							// 存储
							SpiderImages spiderImages = new SpiderImages();
							spiderImages.setCategoryId(spiderCategory.getId());
							spiderImages.setUrl(imagesUrl);
							spiderImages.setName(name);
							imagesDAO.insertSelective(spiderImages);


							System.out.println(document);
						}
						Thread.sleep(200);
						if (currentPage >= total) {
							break;
						}

					}


				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("出现异常");
				}
			}
		}





//		//  具体图片
//		Elements elementsByTag = document.getElementsByTag("center").get(0).getElementsByTag("img");
//
//		for (int i = 0; i < elementsByTag.size(); i++) {
//			String imagesUrl  = elementsByTag.get(i).attr("src");
//		}
//
//		// 总页数
//		Elements aTagList = ((Document) document).getElementById("pages").getElementsByTag("a");
//		Element element = aTagList.get(aTagList.size() - 2);
//		String text = element.text();
//		int pages = Integer.parseInt(text);
//        File file = new File("/Users/admin/Desktop/personal/images");
//        // 不存在则创建文件夹
//        if (!file.exists()) {
//            file.mkdir();
//        }
//
//        // 获取该文件夹下所有文件
//        File[] files = file.listFiles();
//		String[] split = referer.split("/");
//		String dirName = split[split.length - 1];
//		dirName = dirName.substring(0, dirName.length() - ".html".length());
//		if (StringUtils.isBlank(name)) {
//			dirName = absPath+"/"+"default_"+dirName;
//		}else {
//			dirName = absPath+"/"+name + "_" + dirName;
//		}
//		File file = new File(dirName);
//		if (!file.exists()) {
//			file.mkdir();
//		}
//		File[] files = file.listFiles();
//		int order = files.length;
//		order++;
	}

	/**
	 * 转map，方便去重
	 * @param images
	 * @return
	 */
	private Map<String, SpiderImages> getImagesMap(List<SpiderImages> images) {
		Map<String, SpiderImages> map = new HashMap<>();

		images = Optional.ofNullable(images).orElse(new ArrayList<>());
		for (SpiderImages spiderImages : images) {
			map.put(spiderImages.getUrl(), spiderImages);
		}

		return map;
	}


	private void getImagesUrl() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					ImagesObjectUtils.doGetImagesUrl(imagesDAO, imagesUrlDAO);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}

}
