package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 观察者模式（Observer Pattern)也叫发布订阅模式（Publish/subscribe)
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 * 定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知被自动更新。
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午10:17
 */
public class WangSi implements Observer {
    // 王斯，看到韩非子有活动
    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也要开始活动...");
        this.cry(context);
        System.out.println("王斯：哭死了...");
    }
    // 一看韩非子有活动，他就痛哭
    private void cry(String context) {
        System.out.println("王斯：因为"+context+", -->所有我悲伤呀！");
    }
}
