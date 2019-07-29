package cn.xiaoyanol.practice.leetcode.practice476;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午4:32
 */
public class Solution {

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] chars = s.toCharArray();
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] == '1') {
               chars[i] = '0';
           }else {
               chars[i] = '1';
           }
       }
        return Integer.parseInt(new String(chars), 2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findComplement(1));
    }
}
