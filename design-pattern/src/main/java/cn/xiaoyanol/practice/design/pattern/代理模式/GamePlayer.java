package cn.xiaoyanol.practice.design.pattern.代理模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-08
 * @Time: 上午10:35
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    // 通过构造函数传递名称
    public GamePlayer(String _name) {
        this.name = _name;
    }

    // 构造函数限制谁能创建对象，并同时传递名称
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception{
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色");
        }else {
            this.name = _name;
        }
    }

    // 进游戏之前你肯定要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {

        if (isProxy()) {
            System.out.println("登录名为" + user + "的用户 " + this.name + "登录成功！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    // 打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.println(this.name + "在打怪！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    // 升级，升级有很多方法，花钱买是一种，做任务也是一种
    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    // 找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return true; // todo
        }else {
            return true;
        }
    }
}
