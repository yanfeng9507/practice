package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 有处理权的人员接口
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:29
 */
public interface IHandle {
    // 一个女性（女儿、妻子或母亲）要求逛街，你要处理这个请求
    void handleMessage(IWomen women);
}
