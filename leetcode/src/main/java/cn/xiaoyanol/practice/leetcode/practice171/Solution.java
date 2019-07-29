package cn.xiaoyanol.practice.leetcode.practice171;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午4:13
 */
public class Solution {
    public int titleToNumber(String s) {
        int i = s.length() - 1;
        int sum = 0;
        int count=0;
        while (i >= 0) {
            int num = (int)((s.charAt(i) - 'A' +1) * Math.pow(26, count++));
            sum += num;
            i--;
        }
        return sum;
    }
    public int titleToNumber2(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + (int)(s.charAt(i) - 'A' +1);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber2("ZZ"));
    }
}
