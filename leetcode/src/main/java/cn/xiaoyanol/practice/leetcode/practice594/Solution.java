package cn.xiaoyanol.practice.leetcode.practice594;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午7:37
 */
public class Solution {

    /**
     * 暴力破解
     * @param nums
     * @return
     */
//    public int findLHS(int[] nums) {
//        Arrays.sort(nums);
//        int length = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j< nums.length; j++) {
//                if (nums[j] - nums[i] ==1) {
//                    length = Math.max(j - i +1, length);
//                }
//            }
//        }
//        return length;
//    }
    public int findLHS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        Queue<Integer> queue = new LinkedList<>();
        int pre = nums[0];
        int length = 0;
        for (int num : nums) {
            if (!queue.isEmpty() && num - queue.peek() > 1) {
                if (pre - queue.peek() == 1) {
                    length = Math.max(queue.size(), length);
                }
                queue.poll();
            }
            queue.offer(num);
            pre = num;
        }
        if (pre - queue.peek() == 1) {
            length = Math.max(queue.size(), length);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findLHS(new int[]{1,1,2,2}));
    }
}
