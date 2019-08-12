package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午3:18
 */
public class ConcreteHandler2 extends Handler {
    public ConcreteHandler2(int _level) {
        super(_level);
    }

    // 设置自己的处理级别
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    // 定义自己的处理逻辑
    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }

}
