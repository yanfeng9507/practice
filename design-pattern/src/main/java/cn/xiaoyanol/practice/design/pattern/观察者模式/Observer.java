package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午9:48
 */
public interface Observer {
    // 一发现别人有动静，自己也要行动起来
    void update(String context);
}
