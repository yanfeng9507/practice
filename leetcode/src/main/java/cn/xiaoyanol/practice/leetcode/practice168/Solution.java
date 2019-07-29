package cn.xiaoyanol.practice.leetcode.practice168;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-15
 * @Time: 下午4:43
 */
public class Solution {
    public String convertToTitle(int n) {

        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            if (n % 26 == 0) {
                sb.append('Z');
                n = n-26;
            }else {
                sb.append((char)(n%26 -1 + 'A'));
            }
            n = n/26;
        }
        return sb.reverse().toString();

    }

    /**
     * # 分析这道题就是一个余数的概念。1-26分别代表A-Z，其实这道题也和二进制，或者十进制的计算类似，
     * 但不一样。这里不能直接把n/26，而是需要(n-1)/26，
     * 是这样的，余数只有0-25，因为26*26+26表示为ZZ，
     * 可以理解为(25+1) *26+(25+1),所以每次都需要-1再/26。
     * @param n
     * @return
     */
    public String convertToTitle2(int n) {
        StringBuffer result = new StringBuffer();
        while(n>0){
            int remainder = (n-1) % 26;
            result.append((char)(remainder+'A'));
            n = (n-1)/26;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().convertToTitle(702));
    }

}
