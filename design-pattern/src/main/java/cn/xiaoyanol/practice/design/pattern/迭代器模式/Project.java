package cn.xiaoyanol.practice.design.pattern.迭代器模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:48
 */
public class Project implements IProject {

    // 定义一个项目列表，说有的项目都放在这里
    private ArrayList<IProject> projectList = new ArrayList<>();


    // 项目名称
    private String name = "";
    // 项目成员数量
    private int num = 0;
    // 项目费用
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    public Project() {

    }

    // 得到项目的信息
    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是："+this.name;
        // 获得项目人数
        info = info+"\t项目人数："+this.num;
        // 项目的费用
        info = info+"\t项目费用："+this.cost;
        return info;
    }
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public void add(IProject project) {
        this.projectList.add(project);
    }

    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
