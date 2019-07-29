package cn.xiaoyanol.practice.leetcode.practice108;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 下午8:52
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return  null;
        }
        return buildTree(nums, 0, nums.length - 1 );
    }
    public TreeNode buildTree(int[] nums, int left, int right) {
        TreeNode head = null;
        if (left <= right) {
            int mid = left+(right-left)/2;
             head = new TreeNode(nums[mid]);
            head.left = buildTree(nums,left, mid - 1);
            head.right = buildTree(nums, mid+1, right);
        }
        return head;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new Solution().sortedArrayToBST(new int[]{-10,-3,0,5,9});
        print(treeNode);
//        System.out.print(treeNode+" ");
    }





    private static void print(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.val+" ");
            print(treeNode.left);
            print(treeNode.right);
        }else {
            System.out.print("# ");
        }
    }
}
