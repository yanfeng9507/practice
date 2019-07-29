package cn.xiaoyanol.practice.leetcode.practice203;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午8:34
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode h = head;
        while (h != null && h.val == val) {
            h = h.next;
        }
        ListNode p = h;
        ListNode pre = h;
        while (p != null) {
            while (p != null && p.val == val) {
                pre.next = p.next;
                p = p.next;
            }
            if (p != null) {
                pre = p;
                p = p.next;
            }
        }
        return h;
    }

    // 递归
    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 从最后一个开始判断移除
        head.next = removeElements2(head.next, val);
        return head.val == val ? head.next : head;
    }
}
