package cn.xiaoyanol.practice.leetcode.practice530;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午7:09
 */
public class Solution {

    int min = Integer.MAX_VALUE;

    /**
     * 递归每个节点 找出每个节点的最小值
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return min;
        }
        int t = getMinimumDifference(root.left);
        int t2 = getMinimumDifference(root.right);

        int t3 =  Math.min(getMinimumDifference(root.left, root.val), getMinimumDifference(root.right, root.val));
        min = Math.min(t, t2);
        min = Math.min(t3, min);
        return min;
    }

    public int getMinimumDifference(TreeNode root, int value) {
        if (root == null) {
            return min;
        }
        min = Math.min(Math.abs(root.val -  value), min);
        min = Math.min(getMinimumDifference(root.left, value), min);
        min = Math.min(getMinimumDifference(root.right, value), min);
        return min;
    }
}
