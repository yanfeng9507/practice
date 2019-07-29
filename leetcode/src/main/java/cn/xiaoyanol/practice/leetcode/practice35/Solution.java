package cn.xiaoyanol.practice.leetcode.practice35;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-07
 * @Time: 上午10:47
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }else if (target > nums[i] && i == nums.length - 1) {
                return nums.length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6},0));
    }
}
