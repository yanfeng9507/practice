package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:43
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;

    public final static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个责任人是谁
    private Handler nextHandler;

//    // 每个类都要说明一下自己能处理哪些请求
//    public Handler(int _level) {
//        this.level = _level;
//    }
//
//    // 一个女性（女儿、妻子或是母亲）要求逛街，你要处理这个请求
//    public final void handMessage(IWomen women) {
//        if (women.getType() == this.level) {
//            this.response(women);
//        }else {
//            if (this.nextHandler != null) {
//                // 有后续的环节，才把请求往后递送
//                this.nextHandler.handMessage(women);
//            }else {
//                // 已经没有后续处理人了，不用处理
//                System.out.println("---没有地方请示了，按不同意见处理---");
//            }
//        }
//    }
//
//    public void setNext(Handler _handler) {
//        this.nextHandler = _handler;
//    }
//
//    // 有请示那当然要回应
//    protected abstract void response(IWomen women);

    // 每个类都要说明一下自己能处理哪些请求
    public Handler(int _level) {
        this.level = _level;
    }

    // 每个处理者都必须对请求作出处理
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断是否自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = echo(request);
        }else {
            // 不属于自己的处理级别
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            }else {
                // 没有适当的处理者，业务自行处理
            }
        }
        return response;
    }

    // 设置下一个处理者是谁
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    // 每个处理者都有一个处理级别
    protected abstract Level getHandlerLevel();

    // 每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
