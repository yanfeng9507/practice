package cn.xiaoyanol.practice.leetcode.practice326;

import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午12:38
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1 ? true : false;
    }

    /**
     * 非常棒的思路
     * @param n 1162261467 是整数范围内的最大的 3 的 19次方
     *          如果 n 是 3 的幂 1162261467一定可以整除  n
     * @return
     */
    public boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467%n == 0;
    }

    /**
     * 鬼才啊
     * @param n
     * @return
     */
    public boolean isPowerOfThree3(int n) {
        if(n==0)
            return false;
        if(n==Math.pow(3,0)|n==Math.pow(3,2)|n==Math.pow(3,1)|n==Math.pow(3,2)|n==Math.pow(3,3)|n==Math.pow(3,4)|n==Math.pow(3,5)|n==Math.pow(3,6)|n==Math.pow(3,7)|n==Math.pow(3,8)|n==Math.pow(3,9)|n==Math.pow(3,10)|n==Math.pow(3,11)|n==Math.pow(3,12)|n==Math.pow(3,13)|n==Math.pow(3,14)|n==Math.pow(3,15)|n==Math.pow(3,16)|n==Math.pow(3,17)|n==Math.pow(3,18)|n==Math.pow(3,19)|n==Math.pow(3,20))
            return true;
        return false;
    }

    /**
     * 鬼才啊
     * @param n
     * @return
     */
    public static boolean isPowerOfThree4(int n) {
        return Pattern.matches("^10*$", Integer.toString(n,3));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfThree(27*3));
        String s = Integer.toString(27, 3);
        System.out.println(isPowerOfThree4(28));

    }
}
