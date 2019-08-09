package cn.xiaoyanol.practice.design.pattern.downloader;

import cn.xiaoyanol.practice.design.pattern.response.Response;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Created with IntelliJ IDEA.
 * Description: 下载器接口
 * 一般来说下载页面，也有下载文件
 * 下载器属性
 *  - 线程数
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-30
 * @Time: 下午5:37
 */
public interface Downloader{

    /**
     * 下载
     * @return 下载完成的对象
     */
    Future<Response> download(Request request);


    /**
     * 设置下载器线程数
     * @param threads
     */
    void setThreads(int threads);

    /**
     * 根据url获取请求
     * @param url
     * @return
     */
    Request getRequest(String url);

    /**
     * 检查是否包含了当前请求
     * @param url
     * @return
     */
    boolean containsRequest(String url);

    /**
     * 获取线程池
     * @return
     */
    ExecutorService getExecutorService();
}
