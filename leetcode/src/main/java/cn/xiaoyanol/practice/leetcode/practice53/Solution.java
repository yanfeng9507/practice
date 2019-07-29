package cn.xiaoyanol.practice.leetcode.practice53;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-07
 * @Time: 下午7:26
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0] > 0 ? nums[0] : 0;
        for (int i = 1; i < nums.length; i++) {
            max = max > nums[i] ? max : nums[i];
            if (sum + nums[i] < 0) {
                sum = 0;
                continue;
            }
            sum += nums[i];
            System.out.println(sum);
            max = max > sum ? max : sum;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{12,3,-4,4,-1,2,1,-5,4,-100,1,2}));
    }
}
