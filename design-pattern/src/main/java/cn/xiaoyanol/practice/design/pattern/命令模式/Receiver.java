package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:56
 */
public abstract class Receiver {
    // 抽象接收者，定义每个接受者必须完成的业务
    public abstract void doSomething();
}
