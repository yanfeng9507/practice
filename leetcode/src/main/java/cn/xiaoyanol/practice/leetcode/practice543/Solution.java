package cn.xiaoyanol.practice.leetcode.practice543;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午3:43
 */
public class Solution {

    // 先遍历每个节点， 然后计算每个节点的最大值
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int i = diameterOfBinaryTree(root.left);
        int i1 = diameterOfBinaryTree(root.right);
        int i2 = depth(root.left) + depth(root.right);
        int max = Math.max(i,i1);
        max = Math.max(i2, max);
        return max;

    }



    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
