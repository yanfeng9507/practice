package cn.xiaoyanol.practice.leetcode.practice908;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午2:00
 */
public class Solution {

    // max - min 的值 减去两个K如果是小于0 说明 max 能减去 一个不大于K的数后等于min+上一个不大于K的数
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];

        for (int num : A) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return Math.max(0, max - min - K - K);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().smallestRangeI(new int[]{3,1,10}, 4));
        System.out.println(new Solution().smallestRangeI(new int[]{7,8,8}, 5));
        System.out.println(new Solution().smallestRangeI(new int[]{1}, 0));
        System.out.println(new Solution().smallestRangeI(new int[]{0,10}, 2));
        System.out.println(new Solution().smallestRangeI(new int[]{1,3,6}, 3));
    }
}
