package cn.xiaoyanol.practice.leetcode.practice563;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午8:31
 */
public class Solution {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findTilt(root.left) +
        findTilt(root.right) + Math.abs(sum(root.left) - sum(root.right));

    }

    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
}
