package cn.xiaoyanol.practice.leetcode.practice884;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 可以理解成拼接字符串A+B，然后返回拼接后的字符串中只出现过一次的单词
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午7:47
 */
public class Solution2 {

    public String[] uncommonFromSentences(String A, String B) {
        String s = A +" "+ B;
        String[] split = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : split) {
            Integer count = Optional.ofNullable(map.get(string)).orElse(0);
            count++;
            map.put(string, count);
        }
        List<String> list =new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
