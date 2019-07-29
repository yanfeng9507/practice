package cn.xiaoyanol.practice.leetcode.practice441;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午2:21
 */
public class Solution {
    // 暴力 todo 未完待续
    public int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; n - i >=0; i++) {
            count++;
            n = n-i;
        }
        return count;
    }
}
