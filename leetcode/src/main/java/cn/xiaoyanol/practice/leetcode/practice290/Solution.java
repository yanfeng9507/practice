package cn.xiaoyanol.practice.leetcode.practice290;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 上午11:51
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null) {
            return false;
        }
        String[] split = str.split(" ");
        if (pattern.length() != split.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap();
        for (int i = 0; i < pattern.length(); i++) {
            String s = map.get(pattern.charAt(i));
            if (s != null) {
                if (!split[i].equals(s)) {
                    return false;
                }
            }else {
                // 唯一关联
                if (map.containsValue(split[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), split[i]);
            }
        }
        return true;
    }
}
