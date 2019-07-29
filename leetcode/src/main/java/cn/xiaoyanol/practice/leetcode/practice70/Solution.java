package cn.xiaoyanol.practice.leetcode.practice70;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午10:55
 */
public class Solution {
    public int climbStairs(int n) {

        int pre = 1;
        int next = 1;
        int result = 1;
        for (int i = 1; i < n; i++) {
            result = pre + next;
            pre = next;
            next = result;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(new Solution().climbStairs(i));
        }
    }
}
