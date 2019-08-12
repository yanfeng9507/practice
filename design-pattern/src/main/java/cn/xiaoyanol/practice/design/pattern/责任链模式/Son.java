package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:35
 */
public class Son extends Handler implements IHandle{

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    // 母亲向儿子请示
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
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
//        System.out.println("---母亲向儿子请示---");
//        System.out.println("母亲的请示是："+women.getRequest());
//        System.out.println("儿子的答复是：同意");
//    }
}
