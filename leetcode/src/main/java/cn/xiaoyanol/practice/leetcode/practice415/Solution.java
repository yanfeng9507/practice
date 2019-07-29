package cn.xiaoyanol.practice.leetcode.practice415;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午12:01
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer sb1 = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);
        StringBuffer res = new StringBuffer();

        String s1 = sb1.reverse().toString();
        String s2 = sb2.reverse().toString();

        int i = 0;
        int cnt = 0;
        while ( i < s1.length() && i < s2.length()) {
            int sum = (s1.charAt(i)+s2.charAt(i) - '0' - '0' + cnt) % 10;
            res.append(sum);
            cnt = (s1.charAt(i)+s2.charAt(i) - '0' - '0'+cnt )/10;
            i++;
        }
        while ( i < s1.length()) {
            int sum = (s1.charAt(i)+cnt - '0') %10;
            res.append(sum);
            cnt = (s1.charAt(i)+cnt - '0')/10;
            i++;
        }
        while ( i < s2.length()) {
            int sum = (s2.charAt(i)+cnt - '0') % 10;
            res.append(sum);
            cnt = (s2.charAt(i)+cnt - '0')/10;
            i++;
        }
        if (cnt == 1) {
            res.append(cnt);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addStrings("193", "9"));
        System.out.println(new Solution().addStrings("9", "1"));
    }
}
