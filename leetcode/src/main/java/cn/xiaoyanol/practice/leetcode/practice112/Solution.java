package cn.xiaoyanol.practice.leetcode.practice112;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-11
 * @Time: 下午1:19
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum){
        if (root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return sum - root.val == 0;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
