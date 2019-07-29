package cn.xiaoyanol.practice.leetcode.practice1002;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午6:44
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        int[][] map = new int[A.length][26];

        for (int i = 0; i < A.length; i++){
            for (char c : A[i].toCharArray()) {
                map[i][c-'a']++;
            }
        }
        List<String> list = new ArrayList<>();
        for (int i =0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < map.length; j++) {
                min = Math.min(min, map[j][i]);
            }
            for (int k = 0; k < min; k++) {
                list.add((char)(i+'a')+"");
            }
        }
        return list;
    }
}
