package cn.xiaoyanol.practice.design.pattern.责任链模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-11
 * @Time: 下午2:23
 */
public interface IWomen {
    // 获得个人状况
    int getType();

    // 获得个人请示，你要干什么？出去逛街？约会？还是看电影？
    String getRequest();

}
