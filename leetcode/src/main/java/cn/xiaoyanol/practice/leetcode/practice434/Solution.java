package cn.xiaoyanol.practice.leetcode.practice434;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午12:40
 */
public class Solution {

    // 如果当前字符不是空格 而前一个是空格则认为是单词
    public int countSegments(String s) {
        int count = 0;
        s = "  "+s;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)!= ' ' && s.charAt(i-1)==' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countSegments("Hello, my name is John"));
    }
}
