package cn.xiaoyanol.practice.leetcode.practice231;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午4:02
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        // 负数不可能是2的n次方
        if (n < 0) {
            return false;
        }
        int count = 0;
        while (n != 0) {
            count++;
            n &=n-1;
        }
        return count == 1 ? true : false;
    }

    public static void main(String[] args) {
        new Solution().isPowerOfTwo(-8);
    }
}
