package cn.xiaoyanol.practice.leetcode.practice590;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午1:58
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    private void postOrder(Node root, List<Integer> list) {
        if (root != null) {
            if (root.children != null) {
                for (int i = 0; i < root.children.size(); i++) {
                    postOrder(root.children.get(i), list);
                }
            }
            list.add(root.val);
        }
    }
}
