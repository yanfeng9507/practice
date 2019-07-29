package cn.xiaoyanol.practice.leetcode.practice58;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-07
 * @Time: 下午8:03
 */
public class Solution {
    public int lengthOfLastWord(String s) {

        if (s.trim().length() == 0) {
            return 0;
        }
        String[] split = s.split(" ");
        return split[split.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("  "));
    }
}
