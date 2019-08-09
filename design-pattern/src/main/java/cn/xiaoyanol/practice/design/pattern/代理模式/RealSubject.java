package cn.xiaoyanol.practice.design.pattern.代理模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午11:02
 */
public class RealSubject implements Subject {
    // 实现方法

    @Override
    public void doSomething(String str) {
        System.out.println("do something!--->" + str);
    }
}
