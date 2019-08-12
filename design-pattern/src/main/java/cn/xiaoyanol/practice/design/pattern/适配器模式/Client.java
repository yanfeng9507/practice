package cn.xiaoyanol.practice.design.pattern.适配器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Convert the interface of a class into another interface clients expect.Adapter lets classes
 * work together  that couldn't otherwise because of incompatible interfaces.
 * 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:27
 */
public class Client {
//    public static void main(String[] args) {
//        IUserInfo youngGirl = new OuterUserInfo();
//        for (int i = 0; i < 101; i++){
//            System.out.println(youngGirl.getMobileNumber());
//        }
//    }

    public static void main(String[] args) {
        // 原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        // 闲杂增加了适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
