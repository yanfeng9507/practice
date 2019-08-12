package cn.xiaoyanol.practice.design.pattern.适配器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 原角色
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:32
 */
public class Adaptee {

    // 原有的业务逻辑
    public void doSomething() {
        System.out.println("I'am kind od busy, leave me alone, please!");
    }
}
