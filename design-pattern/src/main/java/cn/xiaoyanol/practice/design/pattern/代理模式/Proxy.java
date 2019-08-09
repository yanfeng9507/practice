package cn.xiaoyanol.practice.design.pattern.代理模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午11:05
 */
public class Proxy implements Subject {

    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object...objects) {

    }

    public Proxy(Subject _subject) {
        this.subject = _subject;
    }

    // 实现接口中定义的方法
    public void request() {
        this.before();
//        this.subject.request();
        this.after();
    }
    // 预处理
    private void before() {

    }

    // 善后处理
    private void after() {

    }

    @Override
    public void doSomething(String str) {

    }
}
