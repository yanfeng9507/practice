package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午3:01
 */
public class ConcreteCommand2 extends Command {

    // 对那个Receiver类进行命令处理
    private Receiver receiver;

    // 构造函数传递接收者
    public ConcreteCommand2(Receiver _receiver) {
        this.receiver = _receiver;
    }

    // 必须实现一个命令
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
