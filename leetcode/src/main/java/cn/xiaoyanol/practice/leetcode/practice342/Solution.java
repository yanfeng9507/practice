package cn.xiaoyanol.practice.leetcode.practice342;

import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:10
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        return Pattern.matches("^10*$", Integer.toString(num,4));
    }
}
