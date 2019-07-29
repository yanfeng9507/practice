package cn.xiaoyanol.practice.leetcode.practice868;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午1:47
 */
public class Solution {

    public int binaryGap(int N) {

        int length = 0;
        int tmp = 0;
        boolean flag = true;
        while (N != 0) {

            if (flag) {
                if ((N&1) ==1) {
                    flag = false;
                }
            }else {
                tmp++;
                if ((N & 1) == 1) {
                    length = Math.max(tmp, length);
                    tmp = 0;
                }
            }
            N >>= 1;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().binaryGap(9));
    }
}