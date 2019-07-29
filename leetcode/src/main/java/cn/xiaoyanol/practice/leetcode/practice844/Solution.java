package cn.xiaoyanol.practice.leetcode.practice844;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-28
 * @Time: 上午9:32
 */
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> stack1 = new LinkedList<>();
        LinkedList<Character> stack2 = new LinkedList<>();

        for (char c : S.toCharArray()) {
            if (c == '#' && !stack1.isEmpty()) {
                stack1.pop();
            }
            if (c != '#') {
                stack1.push(c);
            }
        }

        for (char c : T.toCharArray()) {
            if (c == '#' && !stack2.isEmpty()) {
                stack2.pop();
            }
            if (c != '#') {
                stack2.push(c);
            }
        }
        return Arrays.toString(stack1.toArray(new Character[stack1.size()]))
                .equals(Arrays.toString(stack2.toArray(new Character[stack2.size()])));
    }
}
