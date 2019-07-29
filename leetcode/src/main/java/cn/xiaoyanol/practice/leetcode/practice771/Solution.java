package cn.xiaoyanol.practice.leetcode.practice771;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午8:23
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for(char c1 : J.toCharArray()) {
            for (char c2 : S.toCharArray()) {
                if (c1 == c2) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
