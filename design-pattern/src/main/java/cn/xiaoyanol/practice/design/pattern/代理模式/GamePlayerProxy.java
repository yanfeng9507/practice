package cn.xiaoyanol.practice.design.pattern.代理模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午10:51
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer = null;

    // 通过构造函数要对谁进行代练
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    public GamePlayerProxy(String name) {
        try {
            this.gamePlayer = new GamePlayer(this, name);
        }catch (Exception e) {
            // 异常处理
        }
    }

    // 代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    // 代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    // 代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    // 代理的代理暂时还没有，就是自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
