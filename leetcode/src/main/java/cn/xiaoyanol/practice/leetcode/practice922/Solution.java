package cn.xiaoyanol.practice.leetcode.practice922;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午3:18
 */
public class Solution {

    public int[] sortArrayByParityII(int[] A) {
        int i = 0;
        int j = 1;

        while (i < A.length-1) {
            if (A[i] % 2 != 0) {
                while (j < A.length && A[j] % 2 != 0) {
                    j+=2;
                }
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
            }
            i+=2;
        }
        return A;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Solution().sortArrayByParityII(new int[]{2,0,3,4,1,3})));
        System.out.println(Arrays.toString(new Solution().sortArrayByParityII(new int[]{4,1,1,0,1,0})));
    }
}
