package cn.xiaoyanol.practice.leetcode.practice67;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-07
 * @Time: 下午8:11
 */
public class Solution {

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length() -1;
        int j = b.length() -1;
        int m = 0;
        while (i >=0 && j >=0) {
            int sum = (a.charAt(i) + b.charAt(j) - 48*2 + m);
            m = sum/2;
            sb.append(sum%2);
            i--;
            j--;
        }
        while (j >=0) {
            int sum = ( b.charAt(j) - 48 + m);
            m = sum/2;
            sb.append(sum%2);
            j--;
        }
        while (i >=0) {
            int sum = ( a.charAt(i) - 48 + m);
            m = sum/2;
            sb.append(sum%2);
            i--;
        }
        if (m == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
    // 这种写法会溢出
//    public String addBinary(String a, String b) {
//        long numA = 0;
//        long numB = 0;
//        int m = 0;
//        for (int i = a.length() - 1; i >= 0; i--) {
//            numA += (a.charAt(i) - 48)* Math.pow(2,m++);
//        }
//        m = 0;
//        for (int i = b.length() - 1; i >= 0; i--) {
//            numB += (b.charAt(i) - 48) * Math.pow(2,m++);
//        }
//        return Long.toBinaryString(numA+numB);
//    }

    public static void main(String[] args) {
        String s = new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101" ,
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(s);
    }
}