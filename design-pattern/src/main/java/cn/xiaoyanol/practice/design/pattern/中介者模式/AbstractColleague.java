package cn.xiaoyanol.practice.design.pattern.中介者模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象同事类
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-09
 * @Time: 下午2:46
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
