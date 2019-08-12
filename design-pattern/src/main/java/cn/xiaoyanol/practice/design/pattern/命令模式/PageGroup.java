package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:36
 */
public class PageGroup extends Group {
    @Override
    void find() {
        System.out.println("找到美工组。。。");
    }

    @Override
    void add() {
        System.out.println("客户要求增加一个页面。。。");
    }

    @Override
    void delete() {
        System.out.println("客户要求删除一个页面。。。");
    }

    @Override
    void change() {
        System.out.println("客户要求修改一个页面。。。");
    }

    @Override
    void plan() {
        System.out.println("客户要求页面变更计划。。。");
    }
}
