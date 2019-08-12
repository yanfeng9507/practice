package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 具体构件
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:17
 */
public class ConcreteComponent1 extends _Decorator {

    public ConcreteComponent1(Component _component) {
        super(_component);
    }


    // 定义自己的修饰方法
    private void method1() {
        System.out.println("method1 修饰");
    }

    // 重写父类的Operate方法
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }

}
