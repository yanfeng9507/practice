package cn.xiaoyanol.practice.leetcode.practice237;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午8:12
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode p = node;
        while (p != null) {
            p.val = p.next.val;
            if (p.next.next == null) {
                p.next = null;
            }
            p = p.next;
        }
    }

    public void deleteNode2(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
