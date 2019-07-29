package cn.xiaoyanol.practice.leetcode.practice884;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:  可以理解成拼接字符串A+B，然后返回拼接后的字符串中只出现过一次的单词
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午7:40
 */
public class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] splitA = A.split(" ");
        String[] splitB = B.split(" ");

        HashMap<String, Integer> mapA = new HashMap<>();
        HashMap<String, Integer> mapB = new HashMap<>();

        for (String s : splitA) {
            Integer count = Optional.ofNullable(mapA.get(s)).orElse(0);
            count++;
            mapA.put(s, count);
        }
        for (String s : splitB) {
            Integer count = Optional.ofNullable(mapB.get(s)).orElse(0);
            count++;
            mapB.put(s, count);
        }
        List<String> res = new ArrayList<>();
        for (String s : splitA) {
            Integer countB = Optional.ofNullable(mapB.get(s)).orElse(0);
            Integer countA = Optional.ofNullable(mapA.get(s)).orElse(0);
            if (countB == 0 && countA == 1) {
                res.add(s);
            }
        }
        for (String s : splitB) {
            Integer countA = Optional.ofNullable(mapA.get(s)).orElse(0);
            Integer countB = Optional.ofNullable(mapB.get(s)).orElse(0);
            if (countA == 0 && countB == 1) {
                res.add(s);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
