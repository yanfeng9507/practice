package cn.xiaoyanol.practice.design.pattern.策略模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午11:27
 */
public class Add implements _Calculator {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
