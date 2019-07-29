package cn.xiaoyanol.practice.leetcode.practice367;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:52
 */
public class Solution {

    public boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;
        long mid = 0;
        while (left <= right) {
            mid = left + (right - left) /2;
            long sum = mid * mid;
            if ( sum == num) {
                return true;
            }else if (sum < num) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return false;
    }


    //利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
    boolean isPerfectSquare2(int num) {
        int i=1;
        while(num>0)
        {
            num-=i;
            i+=2;
        }
        return num==0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPerfectSquare(2147483647));
    }
}
