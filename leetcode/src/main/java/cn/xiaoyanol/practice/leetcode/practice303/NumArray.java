package cn.xiaoyanol.practice.leetcode.practice303;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午12:14
 */
public class NumArray {
//    private int[] nums;
//    public NumArray(int[] nums) {
//        this.nums = nums;
//    }
//
//    public int sumRange(int i, int j) {
//        int n = j + 1;
//        i = i < 0 ? 0 : i;
//        int sum  = 0;
//        while(i < n && i < nums.length) {
//            sum +=nums[i];
//            i++;
//        }
//        return sum;
//    }

    private int[] nums;
    private int[] sums;
    public NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length+1];
        if (nums.length > 0) {
            sums[0] = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {

            sums[i] = sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        }else {
            return sums[j] - sums[i - 1];
        }
    }
}
