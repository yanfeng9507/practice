package cn.xiaoyanol.practice.leetcode.practice21;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-05
 * @Time: 下午2:49
 */
public class Solution {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;

        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        }else {
            head = l2;
            l2 = l2.next;
        }
        temp = head;

        while (l1 != null && l2 != null) {
            if (l1.val  < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 == null) {
            temp.next = l2;
        }
        if (l2 == null) {
            temp.next = l1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode temp = head1;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;

        ListNode head2 = new ListNode(1);
        temp = head2;
        temp.next = new ListNode(3);
        temp = temp.next;
        temp.next = new ListNode(4);
        temp = temp.next;

        new Solution().mergeTwoLists(head1, head2);

    }


}
