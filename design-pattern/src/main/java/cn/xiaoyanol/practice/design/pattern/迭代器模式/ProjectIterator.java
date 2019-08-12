package cn.xiaoyanol.practice.design.pattern.迭代器模式;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午3:01
 */
public class ProjectIterator implements IProjectIterator{

    // 所有的项目都放在ArrayList中
    private ArrayList<IProject> projectList = new ArrayList<>();

    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    // 判断是否还有元素，必须实现
    @Override
    public boolean hasNext() {
        // 定义一个返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    // 取得下一个值
    @Override
    public Object next() {
        return this.projectList.get(this.currentItem++);
    }
}
