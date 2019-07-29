package cn.xiaoyanol.practice.leetcode.practice88;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-08
 * @Time: 上午11:12
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >=0) {
            if (nums2[j] >= nums1[i]) {
                nums1[k--] = nums2[j--];
            }else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j >=0) {
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        new Solution().merge(new int[]{0}, 0, new int[]{1}, 1);
        new Solution().merge(new int[]{1,2,3,9,0,0,0}, 4, new int[]{2,5,6}, 3);
        System.out.println();
    }
}
