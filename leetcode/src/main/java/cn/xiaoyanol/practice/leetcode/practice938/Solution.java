package cn.xiaoyanol.practice.leetcode.practice938;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午8:28
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
     if (root == null) {
         return 0;
     }
     int tmp = root.val >= L && root.val <= R ? root.val : 0;

     return tmp + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
