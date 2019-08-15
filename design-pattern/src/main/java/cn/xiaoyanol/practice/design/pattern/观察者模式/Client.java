package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午10:24
 */
public class Client {
    public static void main(String[] args) {
        // 三个观察者产生出来
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);

        // 然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
    }
}
