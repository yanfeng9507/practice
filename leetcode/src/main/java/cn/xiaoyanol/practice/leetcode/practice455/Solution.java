package cn.xiaoyanol.practice.leetcode.practice455;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午10:21
 */
public class Solution {

    /**
     * 排序从小到大
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {

            while (j < s.length && s[j] < g[i]) {
                j++;
            }
            if (j < s.length && s[j] >= g[i]) {
                count++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
    }
}
