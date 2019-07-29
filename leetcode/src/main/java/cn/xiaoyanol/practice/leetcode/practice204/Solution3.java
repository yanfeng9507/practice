package cn.xiaoyanol.practice.leetcode.practice204;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 任何一个自然数，总可以表示成为如下的形式之一：
 * 6N，6N+1，6N+2，6N+3，6N+4，6N+5 (N=0，1，2，…)
 * N>1时，其中6N，6N+2，6N+3，6N+4必然不是质数，只可能是6N+1或者6N+5，即6N±1。因此可以通过6N±1筛子大量筛减非质数。
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 上午10:30
 */
public class Solution3 {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for(int a = 3;a *a <=n;a +=2)
        {
            if(n%a == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int i = new Solution3().countPrimes(10);
        System.out.println(i);
    }
}
