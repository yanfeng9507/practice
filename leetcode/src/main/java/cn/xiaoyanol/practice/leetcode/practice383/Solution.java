package cn.xiaoyanol.practice.leetcode.practice383;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午9:47
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) {
            return false;
        }
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i =0; i < ransomNote.length(); i++) {
            Integer count = Optional.ofNullable(ransomNoteMap.get(ransomNote.charAt(i))).orElse(0);
            count++;
            ransomNoteMap.put(ransomNote.charAt(i), count);
        }
        for (int i =0; i < magazine.length(); i++) {
            Integer count = Optional.ofNullable(magazineMap.get(magazine.charAt(i))).orElse(0);
            count++;
            magazineMap.put(magazine.charAt(i), count);
        }
        Set<Character> characters = ransomNoteMap.keySet();
        for (Character c : characters) {
            Integer count1 = ransomNoteMap.get(c);
            Integer count2 = magazineMap.get(c);
            // 杂志上的可以比勒索信上的多
            if (count2 == null || count1 > count2){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("aa", "aab"));
    }
}
