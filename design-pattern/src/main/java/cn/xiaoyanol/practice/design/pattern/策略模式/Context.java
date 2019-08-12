package cn.xiaoyanol.practice.design.pattern.策略模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:54
 */
public class Context  {
    private IStrategy strategy;

    private _IStrategy _strategy;

    private _Calculator _calculator;

    public Context(_IStrategy _strategy) {
        this._strategy = _strategy;
    }

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Context(_Calculator _cal) {
        this._calculator = _cal;
    }

    // 使用计谋了，看我出招
    public void operate() {
        this.strategy.operate();
    }

    // 封装后的策略方法
    public void doAnything() {
        this._strategy.doSomething();
    }

    public int exec(int a, int b, String symbol) {
        return this._calculator.exec(a, b);
    }

}
