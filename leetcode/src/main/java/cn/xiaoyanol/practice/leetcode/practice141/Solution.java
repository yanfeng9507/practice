package cn.xiaoyanol.practice.leetcode.practice141;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-15
 * @Time: 上午10:12
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode current = head;
        ListNode next = head.next != null ? head.next.next : null;

        while (current != null && next != null) {
            if (current == next) {
                return true;
            }
            current = current.next;
            next = next.next != null ? next.next.next : null;
        }

        return false;
    }
}
