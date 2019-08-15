package cn.xiaoyanol.practice.design.pattern.观察者模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-15
 * @Time: 上午10:14
 */
public class LiSi implements Observer {
    // 首先李四是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到李斯活动，开始想老板汇报...");
        reportToQiShiHuang(context);
        System.out.println("李斯：汇报完毕...");
    }

    // 汇报给秦始皇
    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
