package cn.xiaoyanol.practice.leetcode.practice263;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午10:31
 */
public class Solution {
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num = num/2;
                continue;
            }else if (num % 3 == 0) {
                num = num/3;
                continue;
            }else if (num % 5 == 0) {
                num = num/5;
            }else {
                return false;
            }
        }
        return true;
    }
}
