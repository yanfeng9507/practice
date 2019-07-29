package cn.xiaoyanol.practice.leetcode.practice709;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午8:34
 */
public class Solution {
    public String toLowerCase(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c >='A' && c <='Z') {
                c =(char)(c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println('A'-'a');
        System.out.println((char)48);
    }
}
