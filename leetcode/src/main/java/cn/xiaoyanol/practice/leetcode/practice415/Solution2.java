package cn.xiaoyanol.practice.leetcode.practice415;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午12:12
 */
public class Solution2 {
//    public String addStrings(String num1, String num2) {
//        StringBuilder sb = new StringBuilder();
//        int carry = 0, i = num1.length()-1, j = num2.length()-1;
//        while(i >= 0 || j >= 0 || carry != 0){
//            if(i>=0) carry += num1.charAt(i--)-'0';
//            if(j>=0) carry += num2.charAt(j--)-'0';
//            sb.append(carry%10);
//            carry /= 10;
//        }
//        return sb.reverse().toString();
//    }

    public String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int cnt = 0;
        while (i >=0 || j >=0 || cnt > 0) {
            int sum = 0;
            if (i >=0) {
                sum +=num1.charAt(i--) - '0';
            }
            if (j >=0) {
                sum +=num2.charAt(j--) - '0';
            }
            sum += cnt;
            sb.append(sum %10);
            cnt = sum/10;
        }
        return sb.reverse().toString();
    }
}
