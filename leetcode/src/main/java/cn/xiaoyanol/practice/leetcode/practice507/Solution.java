package cn.xiaoyanol.practice.leetcode.practice507;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午2:33
 */
public class Solution {

    public boolean checkPerfectNumber(int num) {

        int n = (int)Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                sum +=i;
                sum += num/i;
            }
        }

        return sum == num && num != 1 ? true : false;
    }
}
