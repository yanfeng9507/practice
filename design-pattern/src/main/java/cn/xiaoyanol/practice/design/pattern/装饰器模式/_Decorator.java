package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象装饰者
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:21
 */
public class _Decorator extends Component {

    private Component component = null;

    // 通过构造函数传递被修饰者
    public _Decorator(Component _component) {
        this.component = _component;
    }

    // 委托碑额修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
