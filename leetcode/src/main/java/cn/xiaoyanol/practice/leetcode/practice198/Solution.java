package cn.xiaoyanol.practice.leetcode.practice198;

/**
 * Created with IntelliJ IDEA.
 * Description:     # m(n) = max(m(n-1), m(n-2)+x(n)) 动态规划，状态转移方程
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午8:15
 */
public class Solution {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] values = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int v1 = 0;
            int v2 = 0;
            if (i - 1 >= 0) {
                v1 = values[i - 1];
            }
            if (i - 2 >= 0) {
                v2 = values[i - 2];
            }
            int v = Math.max(v1, v2 + nums[i]);
            values[i] = v;
        }
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{1,2,3,1}));
    }
}
