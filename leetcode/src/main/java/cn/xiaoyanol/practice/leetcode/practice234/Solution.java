package cn.xiaoyanol.practice.leetcode.practice234;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午4:27
 */
public class Solution {
    // O(n) O(n)   用快慢指针和反转后半部分链表可以到达O（1）空间复杂度
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = head;
        Stack<Integer> stack = new Stack<>();
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        p = head;
        while (p != null) {
            Integer pop = stack.pop();
            if (p.val != pop) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
