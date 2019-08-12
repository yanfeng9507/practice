package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:34
 */
public class RequirementGroup extends Group {
    @Override
    void find() {
        System.out.println("找到需求组。。。");
    }

    @Override
    void add() {
        System.out.println("客户要求增加一项需求。。。");
    }

    @Override
    void delete() {
        System.out.println("客户要求删除一项需求。。。");
    }

    @Override
    void change() {
        System.out.println("客户要求修改一项需求。。。");
    }

    @Override
    void plan() {
        System.out.println("客户要求需求变更计划。。。");
    }
}
