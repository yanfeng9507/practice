package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:32
 */
public class Father extends Handler implements IHandle {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    public void handleMessage(IWomen women) {
        // 未出嫁女儿来请示父亲
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是：同意");
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
//        // 未出嫁女儿来请示父亲
//        System.out.println("女儿的请示是："+women.getRequest());
//        System.out.println(women.getRequest());
//        System.out.println("父亲的答复是：同意");
//    }
}
