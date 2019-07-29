package cn.xiaoyanol.practice.leetcode.practice500;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午8:43
 */
public class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> list = new ArrayList<>();
        for (String word : words) {
            String t = word.toLowerCase();
            if (s1.contains(t.charAt(0)+"")) {
                for (int i = 1; i < t.length(); i++) {
                    if (!s1.contains(t.charAt(i)+"")) {
                        break;
                    }
                    if (i == t.length()- 1) {
                        list.add(word);
                    }
                }
            }else if (s2.contains(t.charAt(0)+"")) {
                for (int i = 1; i < t.length(); i++) {
                    if (!s2.contains(t.charAt(i)+"")) {
                        break;
                    }
                    if (i == t.length()- 1) {
                        list.add(word);
                    }
                }
            }else {
                for (int i = 1; i < t.length(); i++) {
                    if (!s3.contains(t.charAt(i)+"")) {
                        break;
                    }
                    if (i == t.length()- 1) {
                        list.add(word);
                    }
                }
            }
        }
        String[] strings = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i);
        }
        return strings;
    }

    /**
     * map数值相加
     *
     class practice599(object):
     def findWords(self, words):
     """
     :type words: List[str]
     :rtype: List[str]
     """
     res = []
     dic = {'q':'1', 'w':'1', 'e':'1', 'r':'1', 't':'1', 'y':'1', 'u':'1',
     'i':'1', 'o':'1', 'p':'1','a':'2', 's':'2', 'd':'2', 'f':'2',
     'g':'2', 'h':'2', 'j':'2', 'k':'2', 'l':'2','z':'3', 'x':'3',
     'c':'3', 'v':'3', 'b':'3', 'n':'3', 'm':'3'}
     for word in words:
     temp = ''
     s = word.lower()
     for i in range(len(s)):
     temp += dic[s[i]]
     if temp.count(temp[0])==len(word):
     res.append(word)
     return res

     */

    public static void main(String[] args) {
        System.out.println(new Solution().findWords(new String[]{"Hello","Alaska","Dad","Peace"}));
    }
}
