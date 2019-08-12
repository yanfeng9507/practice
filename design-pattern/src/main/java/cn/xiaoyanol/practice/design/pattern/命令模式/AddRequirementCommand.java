package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description: 增加需求的命令
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:44
 */
public class AddRequirementCommand extends Command{

    // 执行增加一项需求的命令
    @Override
    public void execute() {
        // 找到需求组
        rg.find();
        // 增加一项需求
        rg.add();
        // 给出计划
        rg.plan();
    }
}
