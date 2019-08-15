package cn.xiaoyanol.practice.design.pattern.组合模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午5:58
 */
public class Branch extends Corp {

    // 领导也是人，也有名字
    private String name = "";
    // 领导和领导不同，也有职位区别
    private String position = "";
    // 领导也是拿薪水
    private int salary = 0;

    // 领导下边还有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    // 增加一个下属，可能是小头目，也可能是个小兵
    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
