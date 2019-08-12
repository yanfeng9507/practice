package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:38
 */
public class CodeGroup extends Group {
    @Override
    void find() {
        System.out.println("找到代码组。。。");
    }

    @Override
    void add() {
        System.out.println("客户要求增加一项功能。。。");
    }

    @Override
    void delete() {
        System.out.println("客户要求删除一项功能。。。");
    }

    @Override
    void change() {
        System.out.println("客户要求修改一项功能。。。");
    }

    @Override
    void plan() {
        System.out.println("客户要求代码变更计划。。。");
    }
}
