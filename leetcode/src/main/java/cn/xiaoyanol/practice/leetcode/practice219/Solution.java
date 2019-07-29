package cn.xiaoyanol.practice.leetcode.practice219;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午2:41
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int j = i+k;
            if(j >= nums.length) {
                j = nums.length-1;
            }
            while (j > i) {
                if(nums[i] == nums[j--]) {
                    return true;
                }
            }
        }
        return false;
    }
}
