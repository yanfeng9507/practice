package cn.xiaoyanol.practice.leetcode.practice429;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午12:18
 */
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        Node pre = root;
        Node now = root;
        List<Integer> list = new ArrayList<>();
        while (queue.size() != 0) {
            Node poll = queue.poll();
            list.add(poll.val);
            if (poll.children != null) {
                for (Node node : poll.children) {
                    queue.add(node);
                    now = node;
                }
            }
            if (pre == poll) {
                res.add(list);
                list = new ArrayList<>();
                pre = now;
            }
        }
        return res;
    }
}
