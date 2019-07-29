package cn.xiaoyanol.practice.leetcode.practice205;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午12:57
 */
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())return false;

        for(int i = 0;i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(map.containsKey(ss)){
                // 以s为模板  判断 ss 是否一对多
                if(map.get(ss)!=tt)return false;
            }else{
                // 判断 tt 是否一对多
                if(map.containsValue(tt))return false;
                map.put(ss,tt);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        boolean isomorphic = new Solution().isIsomorphic("foo", "bar");
        System.out.println(isomorphic);
    }
}
