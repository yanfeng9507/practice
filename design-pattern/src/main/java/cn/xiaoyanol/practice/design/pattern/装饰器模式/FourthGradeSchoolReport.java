package cn.xiaoyanol.practice.design.pattern.装饰器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午9:49
 */
public class FourthGradeSchoolReport extends SchoolReport {
    // 我的成绩单
    @Override
    public void report() {
        // 成绩单的格式
        System.out.println("尊敬的XXX家长");
        System.out.println("......");
        System.out.println("语文 62 数学 65 体育 98 自然 63");
        System.out.println("......");
        System.out.println("      家长签名：      ");
    }
    // 家长签名
    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
