package cn.xiaoyanol.practice.leetcode.practice496;

import java.util.HashMap;
import java.util.Optional;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午8:08
 */
public class Solution2 {
    /**
     * 1、先遍历大数组nums2，首先将第一个元素入栈；
     * 2、继续遍历，当当前元素小于栈顶元素时，继续将它入栈；当当前元素大于栈顶元素时，
     * 栈顶元素出栈，此时应将该出栈的元素与当前元素形成key-value键值对，存入HashMap中；
     * 3、当遍历完nums2后，得到nums2中元素所对应的下一个更大元素的hash表；
     * 4、遍历nums1的元素在hashMap中去查找‘下一个更大元素’，当找不到时则为-1。

     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums1.length];
        for (int num : nums2) {
            // 如果当前元素大于栈顶元素，说明当前元素是栈顶元素的下一个大
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = Optional.ofNullable(map.get(nums1[i])).orElse(-1);
        }
        return res;
    }
}
