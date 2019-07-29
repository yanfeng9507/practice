package cn.xiaoyanol.practice.leetcode.practice13;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-05
 * @Time: 上午11:09
 */
public class Solution {
    public int romanIoInt(String s) {
        List<Integer> list = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{
         put('I', 1);
         put('V', 5);
         put('X', 10);
         put('L', 50);
         put('C', 100);
         put('D', 500);
         put('M', 1000);
        }};
        int total = 0;
        if (s == null) {
            return total;
        }
        for (int i = 0; i < s.length(); i++) {
            int num1 = Optional.ofNullable(map.get(s.charAt(i))).orElse(0);
            total += num1;
            if (i > 0) {
                int num2 = Optional.of(map.get(s.charAt(i -1))).orElse(0);
                total -= num1 -num2 > 0 ? num2*2 : 0;
            }
        }

        return total;
    }

    public static void main(String[] args) {

//        System.out.println(10>>2);
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3,4);
//        System.out.println(list1.contains(4));
//
//        int iv = new Solution().romanIoInt("IV");
//        System.out.println(iv);
//
//        List<String> strings = Arrays.asList("1","2");
//        Optional.ofNullable(strings).orElse(Arrays.asList()).forEach(s -> System.out.println(s));

        int kmp = kmp("abcbcbbcbdbd", "bcbd");
        System.out.println(kmp);

    }


    public int bf(String source, String pattern) {
        int i = 0;
        int j = 0;
        while (i < source.length() && j < pattern.length()) {
            if (source.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == pattern.length()) {
            return i - j;
        }
        return -1;
    }

    private static int[] getNext(String pattern) {
        int i = 0;
        int j = -1;
        int[] next = new int[pattern.length()];
        next[0] = -1;

        while (i < pattern.length() - 1) {
            if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            }else {
                j = next[j];
            }
        }
        return next;
     }

     private static int kmp(String source, String pattern) {
         
         int[] next = getNext(pattern);
         int i = 0;
         int j = 0;
         while (i < source.length() && j < pattern.length()) {
             if (j == -1 || source.charAt(i) == pattern.charAt(j)) {
                 i++;
                 j++;
             }else {
                 j = next[j];
             }
         }
         if(j == pattern.length()) {
             return i - j;
         }
         return -1;
     }
}
