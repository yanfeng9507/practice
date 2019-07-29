package cn.xiaoyanol.practice.leetcode.practice167;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-15
 * @Time: 下午2:02
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if ( temp == target) {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            if (temp < target) {
                i++;
            }
            if (temp > target) {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
    }
}
