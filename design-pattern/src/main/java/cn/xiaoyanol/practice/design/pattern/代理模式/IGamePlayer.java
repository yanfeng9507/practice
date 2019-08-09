package cn.xiaoyanol.practice.design.pattern.代理模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午10:30
 */
public interface IGamePlayer {

    // 登录
    void login(String user, String password);

    // 杀怪
    void killBoss();

    // 升级
    void upgrade();

    // 每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
