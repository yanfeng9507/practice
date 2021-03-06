package cn.xiaoyanol.practice.leetcode.practice235;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午5:00
 */
public class Solution {
    /**
     * 这一题的重点在于利用BST的二分性质:对两个节点进行二分判断
     * 节点均小于root,那么递归到root的左子树
     * 节点均大于root,那么递归到root的右子树
     * 位于root左右,那么显然root就是最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if( root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p,q);
        }
        if(root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p,q);
        }
        return root;
    }
}
