package cn.xiaoyanol.practice.design.pattern.组合模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午5:51
 */
public abstract class Corp {

    // 公司每个人都有名称
    private String name = "";
    // 公司每个人都有职位
    private String position = "";
    // 公司每个人都有薪水
    private int salary = 0;
    // 通过一个构造函数传递小兵的信息
    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // 获得小兵的信息
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info += "\t职位"+this.position;
        info += "\t薪水"+this.salary;

        return info;
    }
}
