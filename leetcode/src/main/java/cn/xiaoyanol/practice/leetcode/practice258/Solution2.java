package cn.xiaoyanol.practice.leetcode.practice258;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 除了传统的单纯循环，还可以找规律。假如一个三位数'abc'，
 * 其值大小为s1 = 100 * a + 10 * b + 1 * c，经过一次各位相加后，
 * 变为s2 = a + b + c，减小的差值为(s1 -s2) = 99 * a + 9 * b，
 * 差值可以被9整除，每一个循环都这样，缩小了9的倍数。当num小于9，即只有一位时，
 * 直接返回num，大于9时，如果能被9整除，则返回9（因为不可能返回0也不可能返回两位数及以上的值），
 * 如果不能被整除，就返回被9除的余数。
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午10:17
 */
public class Solution2 {
    public int addDigits(int num) {
        if (num > 9) {
            return num % 9 == 0 ? 9 : num % 9;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(38));
    }
}
