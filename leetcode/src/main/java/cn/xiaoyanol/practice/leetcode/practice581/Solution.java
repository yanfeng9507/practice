package cn.xiaoyanol.practice.leetcode.practice581;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午8:55
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int length = 0;
        int[] tempNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tempNums);
        int i = 0;
        int j = nums.length - 1;
        while (j >=0 &&tempNums[j] == nums[j]) {
            j --;
        }
        while (i < nums.length &&tempNums[i] == nums[i]) {
            i++;
        }
        length = Math.max(j - i +1, length);
        return length;
    }
}
