package cn.xiaoyanol.practice.leetcode.practice589;


import cn.xiaoyanol.practice.leetcode.practice429.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午2:04
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    private void preOrder(Node root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            if (root.children != null) {
                for (int i = 0; i < root.children.size(); i++) {
                    preOrder(root.children.get(i), list);
                }
            }
        }
    }
}
