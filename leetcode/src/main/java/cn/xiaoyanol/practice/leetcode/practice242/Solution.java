package cn.xiaoyanol.practice.leetcode.practice242;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午8:21
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        for (int i = 0; i < s.length(); i++) {
            if (charS[i] != charT[i]) {
                return false;
            }
        }
        return true;
    }
}
