package cn.xiaoyanol.practice.design.pattern.迭代器模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-12
 * @Time: 下午2:47
 */
public interface IProject {
    // 从老板这里看到的就是项目信息
    String getProjectInfo();

    // 增加项目
    void add(String name, int num, int cost);

    void add(IProject project);

    // 获取一个可以被遍历的对象
    IProjectIterator iterator();
}
