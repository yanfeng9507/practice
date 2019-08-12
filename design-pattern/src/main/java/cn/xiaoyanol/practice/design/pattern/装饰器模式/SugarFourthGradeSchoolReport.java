package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午9:58
 */
public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {
    // 首先要定义你要美化的方法，先给老爸说学校最高成绩
    private void reportHighScore() {
        System.out.println("这次语文最高是75，数学是78，自然是80");
    }

    // 在老爸看完成绩单后，我再汇报学校的排名情况
    private void reportSort() {
        System.out.println("我的排名是第38名。。。");
    }
    // 由于汇报的内容已经发生变更，那所以要重写父类
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
