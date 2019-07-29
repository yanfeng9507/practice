package cn.xiaoyanol.practice.leetcode.practice371;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午7:53
 */
public class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a^b,(a&b)<<1);
        // a ^ b 相当于 无进位加
        // a & b 相当于求出所有进位 然后右移一位 和之前的得到的相加
    }
}
