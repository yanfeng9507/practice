package cn.xiaoyanol.practice.leetcode.practice633;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-23
 * @Time: 下午1:03
 */
public class Solution {
    public boolean judgeSquareSum(int c) {

        int i = 0;
        int j = (int)Math.sqrt(c);
        while (i <= j) {
            int t = i*i + j*j;
            if ( t == c) {
                return true;
            }else if (t > c) {
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().judgeSquareSum(5));
    }
}
