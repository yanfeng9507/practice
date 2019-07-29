package cn.xiaoyanol.practice.leetcode.practice400;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午10:22
 */
public class Solution {
    // 内存溢出
//    public int findNthDigit(int n) {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 1; i<=n; i++) {
//            stringBuffer.append(i);
//        }
//        char c = stringBuffer.toString().charAt(n - 1);
//        return c-48;
//    }

    public int findNthDigit(int n) {
        n--;//从0开始 索引从0开始
        int first = 1, digits = 1;
        /**
         * 1-9/10-99/100-999/...
         * first 是每组的第一个值
         * digit 是每组的数的位数
         * 每组的总位数9*first*digits
         *
         * while寻找n属于哪个组
         */

        while (n/9/first/digits>=1){//n>=9*first*digits,保证不会溢出
            n-=9*first*digits;
            digits++;
            first*=10;
        }

        /**
         * first为n所属组的第一个数，n/digits当前组的第几个数，n%digits为这个数的第几位
         */
        return (first + n/digits + "").charAt(n%digits) - '0';
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(2147483646));
    }
}
