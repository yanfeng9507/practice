package cn.xiaoyanol.practice.leetcode.practice520;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午3:07
 */
public class Solution {

    public boolean detectCapitalUse(String word) {
        if (word == null) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        if (word.charAt(0) >='A' && word.charAt(0) <='Z') {
            String tmp = word.substring(1);
            return tmp.toLowerCase().equals(tmp) || tmp.toUpperCase().equals(tmp);
        }else {
            return word.toLowerCase().equals(word);
        }
        //1、全部字母都是大写，比如"USA"。
        //2、单词中所有字母都不是大写，比如"leetcode"。
        //3、如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。

    }

    public static void main(String[] args) {
        System.out.println(new Solution().detectCapitalUse("usa"));
    }
}
