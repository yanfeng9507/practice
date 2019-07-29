package cn.xiaoyanol.practice.leetcode.practice190;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午6:45
 */
public class Solution {
    public int reverseBits(int n) {
        int i = 32;
        int sum = 0;
        while (i-- > 0) {
            sum = sum << 1;
            sum +=n&1;
            n = n >> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(32));
    }
}
