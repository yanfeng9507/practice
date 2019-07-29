package cn.xiaoyanol.practice.leetcode.practice202;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午8:27
 */
public class Solution {
    public boolean isHappy(int n) {
        HashSet set = new HashSet();
        int sum = 0;
        while (true) {
            while (n != 0) {
                sum += Math.pow(n%10, 2);
                n = n/10;
            }
            if (sum == 1) {
                return true;
            }
            if (!set.add(sum)) {
                return false;
            }
            n = sum;
            sum = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19));
    }
}
