package cn.xiaoyanol.practice.design.pattern.装饰器模式;

import java.io.BufferedReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Attach additional responsibilities to an object dynamically keeping the same interface.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * 动态地给对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 上午9:54
 */
public class Father {
//    public static void main(String[] args) {
//        // 把成绩单拿过来
//        SchoolReport sr = new FourthGradeSchoolReport();
//        // 看成绩单
//        sr.report();
//        // 签名？休想！
//    }

//    public static void main(String[] args) {
//        // 把美化过的成绩单拿过来
//        SchoolReport sr = new SugarFourthGradeSchoolReport();
//        // 看成绩单
//        sr.report();
//        // 然后老爸，一看，很开心，就签名了
//        sr.sign("老三");
//    }

//    public static void main(String[] args) {
//        // 把成绩单拿过来
//        SchoolReport sr ;
//        // 原装成绩单
//        sr = new FourthGradeSchoolReport();
//        // 加了最高分说明的成绩单
//        sr = new HighScoreDecorator(sr);
//        // 又加了成绩排名的说明
//        sr = new SortDecorator(sr);
//        // 看成绩单
//        sr.report();
//        // 然后老爸，一看，很开心，就签名了
//        sr.sign("老三");
//    }

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteComponent1(component);
        // 第二次修饰
        component = new ConcreteComponent2(component);
        // 修饰后运行
        component.operate();
    }
}
