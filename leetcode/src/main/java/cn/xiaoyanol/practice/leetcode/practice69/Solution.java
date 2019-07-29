package cn.xiaoyanol.practice.leetcode.practice69;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午9:54
 */
public class Solution {

    public int mySqrt(int x) {
//        if (x == 1) {
//            return 1;
//        }
        long left = 0;
        long right = x;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid > x) {
                right = mid-1;
            }else if (mid * mid < x) {
                left = mid+1;
            }else {
                return (int)mid;
            }
        }
        return (int)left-1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(1));
        System.out.println(new Solution().mySqrt(2));
        System.out.println(new Solution().mySqrt(3));
        System.out.println(new Solution().mySqrt(4));
        System.out.println(new Solution().mySqrt(5));
        System.out.println(new Solution().mySqrt(9));
        System.out.println(new Solution().mySqrt(2147395599));
        System.out.println(Math.sqrt(2147395599));
    }
}
