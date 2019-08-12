package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:45
 */
public class DeletePageCommand extends Command {
    // 执行删除一个页面的命令
    @Override
    public void execute() {
        // 找到页面组
        pg.find();
        // 删除一个页面
        pg.delete();
        // 给出计划
        pg.plan();
    }
}
