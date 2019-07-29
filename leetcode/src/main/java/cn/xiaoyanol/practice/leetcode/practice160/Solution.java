package cn.xiaoyanol.practice.leetcode.practice160;


import cn.xiaoyanol.practice.leetcode.practice21.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-15
 * @Time: 下午12:43
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null) {
            lengthA++;
            pA = pA.next;
        }
        pB = headB;
        while (pB != null) {
            lengthB++;
            pB = pB.next;
        }
        pA = headA;
        pB = headB;
        int i = lengthA - lengthB;
        while ( i > 0) {
            pA = pA.next;
            i--;
        }
        int j = lengthB - lengthA;
        while ( j > 0) {
            pB = pB.next;
            j--;
        }
        while (pA != null && pB != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }
        return null;
    }


    /**
     * 与上面原理一样，写得比较巧妙
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        /**
         定义两个指针, 第一轮让两个到达末尾的节点指向另一个链表的头部, 最后如果相遇则为交点(在第一轮移动中恰好抹除了长度差)
         两个指针等于移动了相同的距离, 有交点就返回, 无交点就是各走了两条指针的长度
         **/
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        // 在这里第一轮体现在pA和pB第一次到达尾部会移向另一链表的表头, 而第二轮体现在如果pA或pB相交就返回交点, 不相交最后就是null==null
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
