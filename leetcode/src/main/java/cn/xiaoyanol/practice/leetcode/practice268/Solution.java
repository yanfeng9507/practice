package cn.xiaoyanol.practice.leetcode.practice268;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午10:41
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum +=num;
        }
        int total = (1+max)*max/2;
        return total - sum;
    }

    // 第二种方法异或
    public int missingNumber2(int[] nums) {
        int res = nums.length;
        // 循环里面不会出现length的值，但是nums里面会 res初始化为长度length的值
        // 两个数异或为0
        for (int i = 0; i < nums.length; i++) {
            res ^=nums[i];
            res ^=i;
        }
        return res;
    }
}
