package cn.xiaoyanol.practice.leetcode.practice557;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午6:57
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }
        String[] split = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String string : split) {
            sb.append(new StringBuffer(string).reverse()+" ");
        }
        return sb.substring(0, sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("Let's take LeetCode contest"));
    }
}
