package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午10:21
 */
public class LiuSi implements Observer {

    //刘斯，观察到韩非子活动后，自己也得做一些事
    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(context);
        System.out.println("刘斯：乐死了！");
    }


    private void happy(String context) {
        System.out.println("刘斯：因为"+context+", -->所以我快了呀！");
    }
}
