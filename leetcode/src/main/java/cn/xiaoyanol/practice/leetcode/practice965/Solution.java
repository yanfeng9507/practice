package cn.xiaoyanol.practice.leetcode.practice965;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午3:14
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return root == null ? true : judge(root, root.val);
    }

    private boolean judge(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        return root.val == val && judge(root.left, val) && judge(root.right, val);
    }
}
