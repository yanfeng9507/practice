package cn.xiaoyanol.practice.leetcode.practice501;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 上午11:12
 */
public class Solution2 {

    int pre = 0;
    int max = 0;
    int count = 0;
    List<Integer> list=new LinkedList();
    /**
     * 二叉搜索树的中序遍历是递增序列 该问题可以转换为在递增数组中查找众数
     * @param root
     * @return
     */
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;

    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (root.val != pre) {
            count = 1;
        }else {
            count++;
        }
        pre = root.val;
        if (count >= max) {
            if (count > max) {
                max = Math.max(count, max);
                list.clear();;
            }
            list.add(root.val);
        }
        inOrder(root.right);
    }
}
