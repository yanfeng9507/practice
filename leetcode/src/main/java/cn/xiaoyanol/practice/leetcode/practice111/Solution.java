package cn.xiaoyanol.practice.leetcode.practice111;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-11
 * @Time: 下午12:47
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        // 当 1+rightHeight+leftHeight 执行是 必定有其中一个子树为空 也就是 高度为0 加起来不影响
        return root.left != null && root.right != null ? 1 + Math.min(leftHeight, rightHeight) : 1+rightHeight+leftHeight;
    }

    // 逐层遍历
    // 深度搜索
}
