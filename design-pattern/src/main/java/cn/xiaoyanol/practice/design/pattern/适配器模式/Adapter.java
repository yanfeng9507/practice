package cn.xiaoyanol.practice.design.pattern.适配器模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 适配器角色
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:34
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
