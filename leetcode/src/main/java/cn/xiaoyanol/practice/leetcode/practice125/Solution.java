package cn.xiaoyanol.practice.leetcode.practice125;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-14
 * @Time: 下午8:18
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (c >='a' && c <= 'z') {
                stringBuffer.append(c);
            }
            if (c >='A' && c <= 'Z') {
                stringBuffer.append(c);
            }
            if (c >='0' && c <= '9') {
                stringBuffer.append(c);
            }
        }
        String s1 = stringBuffer.toString().toUpperCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
}
