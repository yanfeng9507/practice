package cn.xiaoyanol.practice.leetcode.practice14;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-05
 * @Time: 上午11:54
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        int index = 0;
        boolean flag = true;
        while (index < strs[0].length()) {
            char temp = strs[0].charAt(index);
            for (int i = 0; i < strs.length; i++) {
                flag = false;
                if (index < strs[i].length() && strs[i].charAt(index) == temp) {
                    flag = true;
                }else {
                    break;
                }
            }
            if (!flag) {
                break;
            }
            index++;
        }
        return strs[0].substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"aaa", "aa", "aaa"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
}
