package cn.xiaoyanol.practice.design.pattern.策略模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午11:04
 */
public class ConcreteStrategy2 implements _IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }

}
