package cn.xiaoyanol.practice.leetcode.practice804;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午1:06
 */
public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String s : words) {
            StringBuffer sb = new StringBuffer();
            for (char c : s.toCharArray()) {
                sb.append(map[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
