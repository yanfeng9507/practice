package cn.xiaoyanol.practice.leetcode.practice1051;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午3:10
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(temp);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (temp[i] != heights[i]) {
                sum++;
            }
        }
        return sum;
    }
}
