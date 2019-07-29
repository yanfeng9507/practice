package cn.xiaoyanol.practice.leetcode.practice409;

import java.util.HashMap;
import java.util.Optional;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 上午12:43
 */
public class Solution {
    public int longestPalindrome(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count = Optional.ofNullable(map.get(c)).orElse(0);
            count++;
            map.put(c, count);
        }
        if (map.size() == 1) {
            return s.length();
        }
        Set<Character> characters = map.keySet();
        int length = 0;
        for (char c : characters) {
            int count = map.get(c);
            if (count > 1) {
                length +=count;
                if (count % 2 == 1) {
                    length -=1;
                }
            }
        }
        if (length < s.length()) {
            length +=1;
        }
        return length;
    }
}
