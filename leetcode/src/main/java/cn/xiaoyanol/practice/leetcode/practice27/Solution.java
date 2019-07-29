package cn.xiaoyanol.practice.leetcode.practice27;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-07
 * @Time: 上午10:30
 */
public class Solution {

    public int removeElement(int[] nums, int val) {

        int countVal = 0;
        for (int num : nums) {
            if (num == val) {
                countVal++;
            }
        }
        int temp = 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums.length - countVal;
    }

    public static void main(String[] args) {
        int i = new Solution().removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(i);
    }
}
