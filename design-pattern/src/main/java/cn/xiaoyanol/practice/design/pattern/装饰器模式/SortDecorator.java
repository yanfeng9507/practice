package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午10:07
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // 告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我的排名是第38名。。。");
    }

    // 老爸看完成绩单后再告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
