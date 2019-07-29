package cn.xiaoyanol.practice.leetcode.practice344;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:15
 */
public class Solution2 {
    public void reverseString(char[] s) {
        swap(0, s.length-1, s);
    }

    public void swap(int start, int end, char[] s) {
        if(start >= end){
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        swap(start+1, end-1, s);
    }
}
