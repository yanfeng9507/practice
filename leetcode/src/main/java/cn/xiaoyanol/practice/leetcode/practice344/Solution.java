package cn.xiaoyanol.practice.leetcode.practice344;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:12
 */
public class Solution {
    public void reverseString(char[] s) {
        if(s.length == 0) {
            return;
        }
        int i = 0;
        int j = s.length -1;

        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}
