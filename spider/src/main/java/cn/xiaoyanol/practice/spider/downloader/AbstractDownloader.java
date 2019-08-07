package cn.xiaoyanol.practice.spider.downloader;

import cn.xiaoyanol.practice.spider.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-31
 * @Time: 上午10:49
 */
@Slf4j
public abstract class AbstractDownloader implements Downloader {

    /**
     * 线程数
     */
    private int threads;

    /**
     * 处理中请求
     */
    private List<Request> handling;

    /**
     * 响应结果
     */
    private List<Response> result;

    /**
     * 重试map
     */
    private Map<Request, Integer> retryMap;

    private ExecutorService executorService;


    public AbstractDownloader(List<Request> handling, List<Response> result, int threads) {
        this.handling = handling;
        this.result = result;
        this.threads = threads;

        initExecutorService(threads);

    }

    /**
     * 初始化线程池
     * @param threads
     */
    private void initExecutorService(int threads) {
        if (threads < 0) {
            throw new RuntimeException("threads error...");
        }
        executorService = Executors.newFixedThreadPool(threads);
    }


    @Override
    public void setThreads(int threads) {
        this.threads = threads;
    }

    @Override
    public Request getRequest(String url) {

        if (StringUtils.isBlank(url)) {
            return null;
        }

        for (Request request : handling) {
            if (request.equals(url)) {
                return request;
            }
        }
        return null;
    }

    @Override
    public boolean containsRequest(String url) {
        for (Request request : handling) {
            if (request.equals(url)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ExecutorService getExecutorService() {
        return executorService;
    }

    protected List<Request> getHandling() {
        return handling;
    }
    protected List<Response> getResult() {
        return result;
    }
    protected Map<Request, Integer> getRetryMap() {
        return retryMap;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, Throwable {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(()-> System.out.println("hello"));
    }
}
