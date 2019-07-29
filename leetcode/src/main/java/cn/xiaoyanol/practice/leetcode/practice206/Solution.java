package cn.xiaoyanol.practice.leetcode.practice206;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午1:53
 */
public class Solution {
    // 迭代
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode t = head;
        ListNode pre = null;
        while (p != null) {
            t = p.next;
            p.next = pre;
            pre = p;
            p = t;
        }
        return pre;
    }
}
