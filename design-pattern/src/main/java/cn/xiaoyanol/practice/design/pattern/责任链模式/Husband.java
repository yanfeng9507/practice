package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 丈夫类
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:31
 */
public class Husband extends Handler implements IHandle {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    // 妻子向丈夫请示
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }

    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }

//    @Override
//    protected void response(IWomen women) {
//        System.out.println("---妻子向丈夫请示---");
//        System.out.println("妻子的请示是："+women.getRequest());
//        System.out.println("丈夫的答复是：同意");
//    }
}
