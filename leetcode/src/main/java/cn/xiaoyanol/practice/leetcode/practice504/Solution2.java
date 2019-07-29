package cn.xiaoyanol.practice.leetcode.practice504;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 上午9:08
 */
public class Solution2 {
    public String convertToBase7(int num) {
        if(num == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag = false;
        if (num < 0) {
            flag = true;
        }
        num = Math.abs(num);
        while (num > 0) {
            stringBuffer.append(num % 7);
            num = num/7;
        }
        String s = stringBuffer.reverse().toString();
        if (flag) {
            s = "-"+s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().convertToBase7(100));
    }
}
