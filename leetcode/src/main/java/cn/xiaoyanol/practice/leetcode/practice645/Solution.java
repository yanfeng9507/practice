package cn.xiaoyanol.practice.leetcode.practice645;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-23
 * @Time: 下午3:50
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(temp[i] == 2) {
                res[0] = i+1;
            }
            if (temp[i] == 0) {
                res[1] = i+1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().findErrorNums(new int[]{1,2,2,4})));
    }
}
