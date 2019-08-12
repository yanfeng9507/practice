package cn.xiaoyanol.practice.design.pattern.适配器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:31
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help, please call me!");
    }
}
