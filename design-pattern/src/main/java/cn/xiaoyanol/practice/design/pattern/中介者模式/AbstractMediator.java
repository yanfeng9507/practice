package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象中介者
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-09
 * @Time: 下午2:34
 */
public abstract class AbstractMediator {
    protected  Purchase purchase;

    protected  Sale sale;

    protected Stock stock;

    // 构造函数
    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object...objects);
}
