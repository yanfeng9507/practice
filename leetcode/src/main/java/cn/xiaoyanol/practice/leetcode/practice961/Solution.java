package cn.xiaoyanol.practice.leetcode.practice961;

import java.util.HashMap;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午4:20
 */
public class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            Integer count = Optional.ofNullable(map.get(num)).orElse(0);
            count++;
            map.put(num, count);
            if (count == A.length/2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().repeatedNTimes(new int[]{1,2,3,3}));
    }
}
