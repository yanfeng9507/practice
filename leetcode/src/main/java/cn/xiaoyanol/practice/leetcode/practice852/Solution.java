package cn.xiaoyanol.practice.leetcode.practice852;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午2:08
 */
public class Solution {

    public int peakIndexInMountainArray(int[] A) {

        int index = 0;
        int num =  A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1] && A[i] > num) {
                index = i;
            }
        }
        return index;
    }
}
