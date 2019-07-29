package cn.xiaoyanol.practice.leetcode.practice482;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:01
 */
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        if (S.length() == 1) {
            return S.replace("-", "").toUpperCase();
        }
        String s = S.replace("-", "").toUpperCase();
        if (s.length() / K < 1) {
            return s;
        }
        int i = s.length() % K;
        StringBuffer sb = new StringBuffer();
        if (i != 0) {
            sb.append(s.substring(0, i) + "-");
        }
        for (; i < s.length(); i += K) {
            sb.append(s.substring(i, i+K)+"-");
        }
        return sb.toString().substring(0,  sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().licenseKeyFormatting("-", 2));
    }
}
