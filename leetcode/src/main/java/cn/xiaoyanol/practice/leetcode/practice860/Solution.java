package cn.xiaoyanol.practice.leetcode.practice860;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午6:58
 */
public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int num : bills) {
            if (num == 5) {
                five++;
            }else if (num == 10) {
                five--;
                ten++;
            }else {
                if (ten > 0) {
                    ten--;
                    five++;
                }else {
                    five -=3;
                }
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
