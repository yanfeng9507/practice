package cn.xiaoyanol.practice.design.pattern.责任链模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Avoid coupling the sender of a request to its receiver by giving more than one object a
 * chance to handle the request.Chain the receiving objects and pass the request along the
 * chain until an object handles it.
 * 使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递
 * 该请求，直到有对象处理它为止。
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:36
 */
public class Client {
//    public static void main(String[] args) {
//        // 随机挑几个女性
//        Random random = new Random();
//        ArrayList<IWomen> arrayList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arrayList.add(new Women(random.nextInt(4), "我要去逛街"));
//        }
//        // 定义三个请示对象
//        IHandle father = new Father();
//        IHandle husband = new Father();
//        IHandle son = new Father();
//
//        for (IWomen women : arrayList) {
//            if (women.getType() == 1) {
//                // 未结婚少女，请示父亲
//                System.out.println("---女儿向父亲请示---");
//                father.handleMessage(women);
//            }else if (women.getType() == 2) {
//                // 已婚少妇，请示丈夫
//                System.out.println("---妻子向丈夫请示---");
//                father.handleMessage(women);
//            }else if (women.getType() == 3) {
//                // 母亲向儿子请示
//                System.out.println("---母亲向儿子请示---");
//                son.handleMessage(women);
//            }else {
//                // 什么也不做
//            }
//        }
//    }

//    public static void main(String[] args) {
//        // 随机挑几个女性
//        Random random = new Random();
//        ArrayList<IWomen> arrayList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arrayList.add(new Women(random.nextInt(4), "我要去逛街"));
//        }
//        // 定义三个请示对象
//        Handler father = new Father();
//        Handler husband = new Husband();
//        Handler son = new Son();
//
//        // 设置请示顺序
//        father.setNext(husband);
//        husband.setNext(son);
//
//        for (IWomen women : arrayList) {
//            father.handMessage(women);
//        }
//    }

        public static void main(String[] args) {
           // 声明所有的处理节点
            Handler handler1 = new ConcreteHandler1(1);
            Handler handler2 = new ConcreteHandler2(2);
            Handler handler3 = new ConcreteHandler3(3);

            // 设置链中的阶段顺序 1-->2-->3
            handler1.setNext(handler2);
            handler2.setNext(handler3);

            // 提交请求返回结果
            Response response = handler1.handleMessage(new Request());


        }

}
