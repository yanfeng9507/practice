package cn.xiaoyanol.practice.leetcode.practice953;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *按照字母表顺序翻译成英文，然后直接比较就好了= =

 class Solution {
 public:
 bool isAlienSorted(vector<string>& words, string order) {
 string s="abcdefghijklmnopqrstuvwxyz";
 int i;
 if (words.size()<=1) return true;
 for (i=0;i<words.size();i++)
 {
 for (auto &ch:words[i])
 ch=s[order.find(ch)];
 if (i>0&&words[i]<=words[i-1]) return false;
 }
 return true;
 }
 };
 * @Author: chenyanfeng
 * @Date: 2019-05-28
 * @Time: 上午9:14
 */
public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.toCharArray().length; i++) {
            map.put(order.charAt(i), i);
        }
        String[] strings = Arrays.copyOf(words, words.length);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0, j = 0; i < o1.length() || j < o2.length(); i++, j++) {
                    int num1 = i < o1.length() ? map.get(o1.charAt(i)) : -1;
                    int num2 = j < o2.length() ? map.get(o2.charAt(j)) : -1;

                    if (num1 - num2 != 0) {
                        return num1 - num2;
                    }
                }
                return 0;
            }
        });
        return Arrays.toString(strings).equals(Arrays.toString(words));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
        System.out.println(new Solution().isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        System.out.println(new Solution().isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }
}
