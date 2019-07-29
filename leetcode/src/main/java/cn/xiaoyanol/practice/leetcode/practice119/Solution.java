package cn.xiaoyanol.practice.leetcode.practice119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-12
 * @Time: 下午10:50
 */
public class Solution {


    /**
     *
     1
     1 1
     1 2 1
     1 3 3 1
     1 4 6 4 1
     1 5 10 10 5 1
     1 6 15 20 15 6 1
     1 7 21 35 35 21 7 1
     1 8 28 56 70 56 28 8 1
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) {
            return list;
        }
        int[] nums = new int[rowIndex+1];
        Arrays.fill(nums, 1);
        // 因为要复用nums[j] 不能重头到尾计算 否则nums[j]的值被覆盖而不准
        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                nums[j] = nums[j - 1] + nums[j];
            }
        }
        for (int value : nums) {
            list.add(value);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> row = new Solution().getRow(5);
        for (Integer value : row) {
            System.out.print(value + " " );
        }
    }

    /*
    1
    1 1
    1 2 1
    1 4 6 4
     */
}
