package cn.xiaoyanol.practice.leetcode.practice389;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午10:16
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] countArr1 = new int[26];
        int[] countArr2 = new int[26];
        for (char c : s.toCharArray()) {
            countArr1[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            countArr2[c - 'a']++;
        }
        for (int i = 0; i < countArr1.length; i++) {
            if (countArr1[i] != countArr2[i]) {
                return (char)(i+'a');
            }
        }
        return '0';
    }

    /**
     * 异或运算
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference2(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char) res;
    }
}
