package cn.xiaoyanol.practice.leetcode.thread;

import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description: 生产者消费者Demo
 *
 * @Author: chenyanfeng
 * @Date: 2019-07-03
 * @Time: 上午11:11
 */
public class SimpleProducerConsumer {

    public static void main(String[] args) {
        Container container = new Container();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);
        producer.start();
        consumer.start();
    }

    static class Container{
        int num;

        public synchronized void get() throws InterruptedException {
            while (num == 0) {
                this.wait();
            }
            num--;
            this.notify();
            System.out.println("消费一个:"+new Date());
        }

        public synchronized void put() throws InterruptedException {
            while (num == 1) {
                this.wait();
            }
            num++;
            this.notify();
            System.out.println("生产一个:"+new Date());
        }
    }

    static class Producer extends Thread{
        private Container container;

        public Producer(Container container) {
            this.container = container;
        }

        @Override
        public  void run() {
            while (true) {
                try {
                    container.put();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread{
        private Container container;

        public Consumer(Container container) {
            this.container = container;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    container.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(new Random().nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
