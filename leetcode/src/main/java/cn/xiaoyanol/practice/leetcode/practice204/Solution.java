package cn.xiaoyanol.practice.leetcode.practice204;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午8:52
 */
public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * 为了判断一个数是否是素数，我们需要依次检查 这个数能否整除[2,n)，时间复杂度n*n
     * @param n
     * @return
     */
    private boolean isPrime2(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for ( int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for ( int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
