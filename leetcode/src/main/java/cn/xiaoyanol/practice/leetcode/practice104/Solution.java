package cn.xiaoyanol.practice.leetcode.practice104;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 下午2:42
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        int depth = getDepth(root, 0);
        return depth;
    }

    public int getDepth(TreeNode root, int depth) {
        if (root != null) {
            depth++;
        }
        if (root == null) {
            return depth;
        }

        return Math.max(getDepth(root.left, depth), getDepth(root.right, depth));
    }

    public static void main(String[] args) {

    }
}
