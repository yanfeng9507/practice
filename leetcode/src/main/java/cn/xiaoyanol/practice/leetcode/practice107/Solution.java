package cn.xiaoyanol.practice.leetcode.practice107;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 下午7:42
 */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        TreeNode pre = root;
        TreeNode record = root;
        queue.offer(root);
        List<Integer> temp = new ArrayList<>();
        while (queue.size() > 0) {
            TreeNode poll = queue.poll();
            temp.add(poll.val);
            if (poll.left != null) {
                queue.offer(poll.left);
            }
            if (poll.right != null) {
                queue.offer(poll.right);
            }
            if(poll.left != null) {
                record = poll.left;
            }
            if(poll.right != null) {
                record = poll.right;
            }
            if (poll == pre) {
                result.add(0,temp);
                temp = new ArrayList<>();
                pre = record;
            }
        }
        if(temp.size()>0) {
            result.add(0,temp);
        }
        return  result;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode t = new TreeNode(2);
        head.left = t;
        t.left =  new TreeNode(4);
        t.right = new TreeNode(5);
        t = new TreeNode(3);
        head.right=t;

        System.out.println(new Solution().levelOrderBottom(head));

    }
}
