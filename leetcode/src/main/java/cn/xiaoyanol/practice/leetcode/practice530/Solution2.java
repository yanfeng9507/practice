package cn.xiaoyanol.practice.leetcode.practice530;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午7:37
 */
public class Solution2 {
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        int min = list.get(1) - list.get(0);
        for (int i = 2; i < list.size(); i++) {
            min = Math.min(Math.abs(list.get(i) - list.get(i-1)), min);
        }

        return min;
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}
