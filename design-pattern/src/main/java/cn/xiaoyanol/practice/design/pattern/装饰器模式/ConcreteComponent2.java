package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 具体构件
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:17
 */
public class ConcreteComponent2 extends _Decorator {

    public ConcreteComponent2(Component _component) {
        super(_component);
    }


    // 定义自己的修饰方法
    private void method2() {
        System.out.println("method2 修饰");
    }

    // 重写父类的Operate方法
    @Override
    public void operate() {
        this.method2();
        super.operate();
    }

}
