package cn.xiaoyanol.practice.leetcode.practice83;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午11:01
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return null;
        }
        ListNode p = head.next;
        ListNode t = head;
        int num = head.val;
        while (p != null) {
            if (num == p.val) {
                t.next = p.next;
            }else{
                num = p.val;
                t = t.next;
            }
            p = p.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
