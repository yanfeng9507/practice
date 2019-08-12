package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:05
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    // 我要汇报最高成绩
    private void reportHighScore() {
        System.out.println("这次语文最高是75，数学是78，自然是80");
    }

    //我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抢起扫帚揍我，我哪里还有就会说啊
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
