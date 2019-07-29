package cn.xiaoyanol.practice.leetcode.practice832;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午8:43
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int j = 0;
            int k = A[i].length - 1;
            while (j < k) {
                // 先交换
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
                j++;
                k--;
            }
            for (int p = 0; p < A[i].length; p++) {
                A[i][p] = A[i][p] == 1 ? 0 : 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));
    }
}
