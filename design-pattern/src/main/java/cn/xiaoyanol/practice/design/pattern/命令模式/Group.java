package cn.xiaoyanol.practice.design.pattern.命令模式;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-08-10
 * @Time: 下午2:31
 */
public abstract class Group {
    // 甲乙双方分开办公，如果你要和某个组讨论，你首先要找到这个组
    abstract void find();
    // 被要求增加功能
    abstract void add();
    // 被要求删除功能
    abstract void delete();
    // 被要求修改功能
    abstract void change();
    // 被要求给出所有的变更计划
    abstract void plan();
}
