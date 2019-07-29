package cn.xiaoyanol.practice.leetcode.practice501;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 上午9:18
 */
public class Solution {

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = findMode(root, map);
        List<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Integer count = map.get(key);
            if (count == max) {
                list.add(key);
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int num : list) {
            res[i++] = num;
        }
        return res;

    }

    private int findMode(TreeNode root, Map<Integer, Integer> map) {
        if (root != null) {
            Integer count = Optional.ofNullable(map.get(root.val)).orElse(0);
            count++;
            map.put(root.val, count);
            int tmp = Math.max(findMode(root.left, map),findMode(root.right, map));
            return Math.max(tmp, count);
        }
        return 0;
    }
}
