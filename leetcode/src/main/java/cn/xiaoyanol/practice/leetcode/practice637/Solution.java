package cn.xiaoyanol.practice.leetcode.practice637;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-23
 * @Time: 上午8:53
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        preOrder(root, 1, lists);
        List<Double> res = new ArrayList<>();
        for (List<Integer> list : lists) {
            double sum = 0;
            for (int num : list) {
                sum += num;
            }
            res.add(sum/list.size());
        }
        return res;
    }

    private void preOrder(TreeNode root, int depth, List<List<Integer>> lists) {
        if (root == null) {
            return;
        }
        if (lists.size() < depth) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        }else {
            // 要去对应层的list
            lists.get(depth-1).add(root.val);
        }
        preOrder(root.left, depth+1, lists);
        preOrder(root.right, depth+1, lists);
    }
}
