package cn.xiaoyanol.practice.leetcode.practice509;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午2:56
 */
public class Solution {

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int pre = 0;
        int current = 1;
        int tmp = 0;
        for (int i = 2; i <=N ; i++) {
            tmp = pre + current;
            pre = current;
            current = tmp;
        }
        return tmp;
    }

    /**
     * 递归
     * @param N
     * @return
     */
    public int fib2(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 1;
        }
        return fib2(N-1)+fib2(N-2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib2(6));
    }
}
