package cn.xiaoyanol.practice.leetcode.practice257;


import cn.xiaoyanol.practice.leetcode.practice100.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午10:23
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        search(root, "", list);
        return list;
    }

    private void search(TreeNode root, String s, List<String> strings) {
        if (root == null) {
            return;
        }
        s = s+root.val+"->";
        if (root.left == null && root.right == null) {
            strings.add(s.substring(0,s.length() - 2));
        }
        search(root.left, s, strings);
        search(root.right, s, strings);
    }
}
