package cn.xiaoyanol.practice.leetcode.practice258;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午8:26
 */
public class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int temp = 0;
        while (true) {
            temp += num % 10;
            num = num /10;
            if (num == 0 && temp >= 10) {
                num = temp;
                temp = 0;
            }
            if(num == 0 && temp < 10){
                return temp;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution().addDigits(19));
    }
}
