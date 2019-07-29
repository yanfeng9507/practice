package cn.xiaoyanol.practice.leetcode.practice551;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午7:52
 */
public class Solution {
    public boolean checkRecord(String s) {
        if (s == null) {
            return false;
        }
        int countA = 0;
        int countL = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
                if (countA == 2) {
                    return false;
                }
            }
            if (c == 'L') {
                countL++;
                if (countL == 3) {
                    return false;
                }
            }else {
               countL = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkRecord("PPALLP"));
    }
}
