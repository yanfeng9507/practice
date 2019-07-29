package cn.xiaoyanol.practice.leetcode.practice404;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 上午12:19
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        return root== null ? 0 : sumOfLeftLeaves(root, root.left)+sumOfLeftLeaves(root, root.right);
    }

    private int sumOfLeftLeaves(TreeNode parent, TreeNode t) {
        if(t == null) {
            return 0;
        }
        if(t == parent.left && t.left== null && t.right==null) {
            return t.val;
        }
        return sumOfLeftLeaves(t, t.left)+sumOfLeftLeaves(t,t.right);
    }
}
