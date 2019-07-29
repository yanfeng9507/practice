package cn.xiaoyanol.practice.leetcode.practice671;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-23
 * @Time: 下午5:56
 */
public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        Integer[] nums = list.toArray(new Integer[list.size()]);
        Arrays.sort(nums);
        int num = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != num) {
                num = nums[i];
                break;
            }
        }
        return num;

    }

    private void preOrder(TreeNode root, List<Integer> list){
        if (root == null) return;

        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
