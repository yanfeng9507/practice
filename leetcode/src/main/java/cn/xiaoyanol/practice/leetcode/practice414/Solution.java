package cn.xiaoyanol.practice.leetcode.practice414;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 上午11:41
 */
public class Solution {

    public int thirdMax(int[] nums) {
        int first = 0;
        int second = 0;
        int third = 0;

        // 去重
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        nums = new int[numsSet.size()];
        int i = 0;
        for (int num : numsSet) {
            nums[i++] = num;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // 不存在第三大的数 返回最大
        if (nums.length < 3) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        first = nums[0];
        second = nums[1];
        third = nums[2];
        int tmp = 0;
        if (first < second) {
            tmp = first;
            first = second;
            second = tmp;
        }
        if (first < third) {
            tmp = first;
            first = third;
            third = tmp;
        }
        if (second < third) {
            tmp = second;
            second = third;
            third = tmp;
        }
        for (i = 3; i < nums.length; i++) {
            tmp = nums[i];
            if (tmp > first) {
                third = second;
                second = first;
                first = tmp;
            }else if (tmp > second) {
                third = second;
                second = tmp;
            }else {
                third = tmp;
            }
        }
        return third;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().thirdMax(new int[]{3,2,1,4,5,6,7,3,1,22,3,45}));
    }

}
