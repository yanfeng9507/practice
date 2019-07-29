package cn.xiaoyanol.practice.leetcode.practice101;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午11:48
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isChildSymmetric(root.left, root.right);
    }

    public boolean isChildSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isChildSymmetric(p.left, q.right) && isChildSymmetric(p.right, q.left);
        }

        return false;
    }

}
