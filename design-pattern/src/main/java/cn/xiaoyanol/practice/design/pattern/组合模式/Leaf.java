package cn.xiaoyanol.practice.design.pattern.组合模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午5:52
 */
public class Leaf extends Corp {
    // 小兵也有名称
    private String name = "";
    // 小兵也有职位
    private String position = "";
    // 小兵也有薪水，否则谁给你干
    private int salary = 0;
    // 通过一个构造函数传递小兵的信息
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }

}
