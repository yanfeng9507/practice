package cn.xiaoyanol.practice.design.pattern.策略模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午11:07
 */
public class Client {
    public static void main(String[] args) {
        // 声明一个具体的策略
        _IStrategy strategy = new ConcreteStrategy1();
        // 声明上下文对象
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnything();
    }

}
