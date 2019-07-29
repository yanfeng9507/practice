package cn.xiaoyanol.practice.leetcode.practice20;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-05
 * @Time: 下午2:10
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        char[] chars = s.toCharArray();
        LinkedList<Character> leftList = new LinkedList<>();
        LinkedList<Character> rightList = new LinkedList<>();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                leftList.push(c);
            }else {
                rightList.push(c);
            }
            char peek = Optional.ofNullable(leftList.peek()).orElse('o');
            if (peek == '(' && c == ')') {
                leftList.pop();
                rightList.pop();
            }
            if (peek == '[' && c == ']') {
                leftList.pop();
                rightList.pop();
            }
            if (peek == '{' && c == '}') {
                leftList.pop();
                rightList.pop();
            }
        }
        return leftList.size() > 0 || rightList.size() > 0 ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()"));
    }
}
