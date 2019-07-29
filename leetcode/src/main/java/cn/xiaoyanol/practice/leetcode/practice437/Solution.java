package cn.xiaoyanol.practice.leetcode.practice437;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午1:11
 */
public class Solution {

//    public int pathSum(TreeNode root, int sum) {
//        return findPathSum(root, 0, sum);
//    }
//
//    public int findPathSum(TreeNode root, int current, int sum) {
//        if (root == null) {
//            return 0;
//        }
//        if (root.left == null && root.right == null && root.val + current == sum) {
//            return 1;
//        }
//        current = current + root.val;
//        return findPathSum(root.left, current, sum) + findPathSum(root.right, current, sum);
//    }

//    思路：一次dfs遍历所有的结点，然后以这个结点为root结点，再次dfs遍历所有路径，即可找出所有路径和为sum的路径
    public int pathSum(TreeNode root, int sum) {
        if (root==null)
            return 0;
        return pathSum(root.left, sum) + pathSum(root.right, sum) + dfs(root, sum);
    }

    public int dfs(TreeNode node, int sum) {
        if (node==null)
            return 0;

        int count = 0;
        if (node.val == sum)
            count = 1;

        return count + dfs(node.left, sum - node.val) + dfs(node.right, sum - node.val);
    }
}
