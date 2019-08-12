package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:57
 */
public class ConcreteReceiver1 extends Receiver{
    // 每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething() {
        System.out.println("最底层的干活小兵...");
    }
}
