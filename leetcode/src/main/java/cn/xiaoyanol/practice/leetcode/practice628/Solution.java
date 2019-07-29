package cn.xiaoyanol.practice.leetcode.practice628;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午12:51
 */
public class Solution {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return Math.max(nums[length-1] * nums[length-2] * nums[length-3]
                , nums[length-1] * nums[0] * nums[1]);
    }
}
