package cn.xiaoyanol.practice.leetcode.practice204;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * ① 合数一定能分解为 若干个 质素相乘 。如 27 = 3x3x3 ，155 = 5x31
 * ② 原命题的真假性 和他的逆否命题相同。因此我们可以推导出第①命题的逆否命题--->： 不能分解为 素数相乘的数一定是质素（素数）。
 *
 * 因此根据这个推导出的定理，我们不再需要将待判断的所有数x去对 [2,sqrt(x)]之间的数试除，
 * 而只需要去对 [2,sqrt(x)]之间的素数试除就OK了。所以：我们必须在迭代判断素数的过程中，
 * 将已经判定为素数的数用数组存储起来，因为后面更大的数判断时，需要用比他小的素数（在[2,sqrt(x)]之间的）去试除做判断。那么这个数组需要多大呢？
 *
 * [0,n]之间有 n +1 个整数，然而0 和 1不是素数也不是质素，因此剩下 n +1 -2 = n-1 个数。素数偶数各一半，除了2，偶数一定不是素数，因此我们大致将这个数组大小定义为  (n-1)/2 +1
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 上午10:07
 */
public class Solution2 {
    public int countPrimes(int n) {
        int count = 0;
        if (n >2) {
            int[] primes = new int[2*(n-1)+1];
            primes[count++]=2;
            for (int i = 3; i < n; i++) {
                if (isPrime(i,primes)) {
                    primes[count++] = i;
                }
            }

        }
        return count;
    }

    private boolean isPrime(int n, int[] primes) {

        for ( int i = 0; primes[i] * primes[i] <= n; i++) {
            if (n % primes[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
