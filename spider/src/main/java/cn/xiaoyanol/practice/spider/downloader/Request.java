package cn.xiaoyanol.practice.spider.downloader;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-30
 * @Time: 下午8:27
 */
@Data
public class Request {

    private String url;

    private String method;

    private Map<String, String> cookies = new HashMap<String, String>();

    private Map<String, String> headers = new HashMap<String, String>();

    private byte[] requestBody;

    public Request() {}

    public Request(String url) {
        this.url = url;
    }
}
