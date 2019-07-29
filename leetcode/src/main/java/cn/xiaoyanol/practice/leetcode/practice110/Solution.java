package cn.xiaoyanol.practice.leetcode.practice110;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-11
 * @Time: 下午12:30
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 获取左子树高度
        // 获取右字树高度
        // 比较左右子树高度
        boolean b = Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
        return b && isBalanced(root.left) && isBalanced(root.right);

    }


    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return  (leftHeight > rightHeight ? leftHeight : rightHeight)+1;
    }
}
