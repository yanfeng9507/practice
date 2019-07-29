package cn.xiaoyanol.practice.leetcode.practice693;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 上午9:22
 */
public class Solution {
    // 可以把问题转换为 数组中查找连续的数
    public boolean hasAlternatingBits(int n) {

        int t = n & 1;
        int count = 0;

        while (n > 0) {
            if ((n & 1 )== t) {
                count++;
                if (count == 2) {
                    return false;
                }
            }else {
                t = n & 1;
                count = 1;
            }
            n >>= 1;
        }
        return true;
    }

    // 更简单的写法
    // int temp=n^(n>>1); n 右移一位 如果n的二进制位是相邻的 异或的结果必然是每一位都是1

    // return (temp&(temp+1))==0; 如果temp每一位都是1 则temp+1 就只有最高位是1 和temp进行& 操作结果为 0

    private static boolean test(int n){
        return (n ^(n>>1) )== 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(test(4));
        System.out.println(test(5));
        System.out.println(new Solution().hasAlternatingBits(4));
    }
}
