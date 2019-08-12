package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午9:48
 */
public abstract class SchoolReport {
    // 成绩单主要韩式的就是你的成绩情况
    public abstract void report();

    // 成绩单要家长签字，这个是最要名的
    public abstract void sign(String name);

}
