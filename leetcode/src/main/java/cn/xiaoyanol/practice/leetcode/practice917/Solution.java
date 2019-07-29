package cn.xiaoyanol.practice.leetcode.practice917;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午8:09
 */
public class Solution {

    public String reverseOnlyLetters(String S) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : S.toCharArray()) {
            if (( c >='a' && c<='z' )|| c >='A' && c <='Z' ){
                stringBuffer.append(c);
            }
        }
        // 反转字符串
        stringBuffer.reverse();
        S = S.toUpperCase();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) <'A' || S.charAt(i)> 'Z') {
                stringBuffer.insert(i, S.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseOnlyLetters("ab-cd"));
        System.out.println(new Solution().reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(new Solution().reverseOnlyLetters("Test1ng-Leet=code-Q!"));

    }
}
