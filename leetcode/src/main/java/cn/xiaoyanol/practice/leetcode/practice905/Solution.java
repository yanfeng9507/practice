package cn.xiaoyanol.practice.leetcode.practice905;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午2:19
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = 0;
        while (j < A.length) {
            if (A[j] % 2 == 0) {
                int tmp = A[j];
                A[j] = A[i];
                A[i] = tmp;
                i++;
            }
            j++;
        }
        return A;
    }
}
