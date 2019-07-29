package cn.xiaoyanol.practice.leetcode.practice100;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午11:38
 */
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSameNode(p, q);
    }

    private boolean isSameNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isSameNode(p.left, q.left) && isSameNode(p.right, q.right);
        }

        return false;
    }
}
