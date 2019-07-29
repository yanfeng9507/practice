package cn.xiaoyanol.practice.leetcode.practice387;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午10:08
 */
public class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            chars[c-'a']++;
        }
        for (char c : s.toCharArray()) {
            if (chars[c-'a'] == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
