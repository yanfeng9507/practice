package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Encapsulate a request as an object, thereby letting parameterize clients with different,
 * queue or log requests, and support undoable operations
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:39
 */
public class Client {
//    public static void main(String[] args) {
//        // 首先客户找到需求组，过来谈需求，并修改
//        System.out.println("------客户要求增加一项需求------");
//        Group rg = new RequirementGroup();
//        // 找到需求组
//        rg.find();
//        //  增加一个需求
//        rg.add();
//        // 要求变更计划
//        rg.plan();
//    }

//    public static void main(String[] args) {
//        // 首先客户找到需求组，过来谈需求，并修改
//        System.out.println("------客户要求删除一个页面------");
//        Group rg = new PageGroup();
//        // 找到需求组
//        rg.find();
//        //  增加一个需求
//        rg.delete();
//        // 要求变更计划
//        rg.plan();
//    }


//    public static void main(String[] args) {
//        // 定义我们的接头人
//        Invoker xiaoSan = new Invoker();
//        // 客户要求增加一项需求
//        System.out.println("----客户要求增加一项需求----");
//        // 客户给我们下命令
//        Command command = new AddRequirementCommand();
//        // 接头人接收到命令
//        xiaoSan.setCommand(command);
//        // 接头人执行命令
//        xiaoSan.action();
//    }

//    public static void main(String[] args) {
//        // 首先声明调用者Invoker
//        Invoker invoker = new Invoker();
//        // 定义接收者
//        Receiver receiver = new ConcreteReceiver1();
//        // 定义一个发送给接收者的命令
//        Command command = new ConcreteCommand1(receiver);
//        // 把命令交给调用者去执行
//        invoker.setCommand(command);
//        invoker.action();
//    }
public static void main(String[] args) {
    // 首先声明调用者Invoker
    Invoker invoker = new Invoker();
    // 定义一个发送给接收者的命令
    Command command = new ConcreteCommand1();
    // 把命令交给调用者去执行
    invoker.setCommand(command);
    invoker.action();
}
}
