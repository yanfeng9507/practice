package cn.xiaoyanol.practice.leetcode.practice876;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午4:48
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && (fast.next != null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
