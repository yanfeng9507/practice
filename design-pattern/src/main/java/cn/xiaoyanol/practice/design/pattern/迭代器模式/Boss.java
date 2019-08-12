package cn.xiaoyanol.practice.design.pattern.迭代器模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description: 迭代器模式（基本不用了）
 * Provide a way to access the elements of an aggregate object sequentially without exposing
 * its underlying representation
 * 它提供一种访问一个容器对象中各个元素，而又不需要暴露该对象的内部细节。
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:51
 */
public class Boss {
//    public static void main(String[] args) {
//        // 定义一个List, 存放所有的项目对象
//        ArrayList<IProject> projectList = new ArrayList<>();
//        // 增加星球大战项目
//        projectList.add(new Project("星球大战项目", 10, 100000));
//        // 增加扭转时空项目
//        projectList.add(new Project("扭转时空项目", 100, 1000000));
//        // 增加超人改造项目
//        projectList.add(new Project("超人改造项目", 10000, 100000000));
//        // 这边100个项目
//        for (int i = 4; i < 104; i++) {
//            projectList.add(new Project("第"+i+"个项目", i*5, i*1000000));
//        }
//
//        // 遍历一下ArrayList, 把所有数据都取出
//        for (IProject project : projectList) {
//            System.out.println(project.getProjectInfo());
//        }
//    }

    public static void main(String[] args) {
        // 定义一个List, 存放所有的项目对象
        IProject project = new Project();
        // 增加星球大战项目
        project.add(new Project("星球大战项目", 10, 100000));
        // 增加扭转时空项目
        project.add(new Project("扭转时空项目", 100, 1000000));
        // 增加超人改造项目
        project.add(new Project("超人改造项目", 10000, 100000000));
        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add(new Project("第"+i+"个项目", i*5, i*1000000));
        }

        // 遍历一下ArrayList, 把所有数据都取出
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
