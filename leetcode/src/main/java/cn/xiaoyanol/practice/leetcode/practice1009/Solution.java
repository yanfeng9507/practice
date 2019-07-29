package cn.xiaoyanol.practice.leetcode.practice1009;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午4:07
 */
public class Solution {
    public int bitwiseComplement(int N) {

        if (N == 0) {
            return 1;
        }
        int n = N;
        int tmp = 0;
        while (n != 0) {
            n = n >> 1;
            tmp = (tmp<< 1) + 1;

        }
        return N ^ tmp;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().bitwiseComplement(5));
    }
}
