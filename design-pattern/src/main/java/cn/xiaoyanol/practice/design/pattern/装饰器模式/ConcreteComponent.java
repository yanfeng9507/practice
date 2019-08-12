package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 具体构件
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:17
 */
public class ConcreteComponent extends Component {
    // 具体实现
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
