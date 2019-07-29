package cn.xiaoyanol.practice.leetcode.thread;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-03
 * @Time: 下午2:20
 */
public class SampleThread extends Thread {

    @Override
    public void run() {
        System.out.println("hello-1");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getState());

// Thread thread = new SampleThread();
//        thread.start();
//        Thread thread = new Thread(new A());
//        thread.start();

        Callable<Integer> c = new B();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(c);
        Thread thread = new Thread(futureTask);
//        thread.start();
        Integer integer = futureTask.get();
//        System.out.println(integer);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = ()->{
            System.out.println("hello-4");
        };
    }

    static class A implements Runnable {

        @Override
        public void run() {
            System.out.println("hello-2");
        }
    }

    static class B implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return 10;
        }
    }

}