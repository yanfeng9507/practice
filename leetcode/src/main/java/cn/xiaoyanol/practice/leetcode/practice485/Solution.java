package cn.xiaoyanol.practice.leetcode.practice485;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:16
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        int j = 0;

        while (i < nums.length && j < nums.length) {
            if (nums[i] == 0 && nums[j] == 0 && j == i) {
                i++;
                j++;
            }else if (nums[j] == 1) {
                j++;
            }else if (nums[j] == 0) {
                max = Math.max(j-i, max);
                j++;
                i = j;
            }
        }
        if (nums[nums.length - 1] == 1) {
            max = Math.max(j-i, max);
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMaxConsecutiveOnes(new int[]{0,0,1,0,0}));
    }
}
