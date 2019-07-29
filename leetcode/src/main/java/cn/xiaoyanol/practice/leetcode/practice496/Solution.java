package cn.xiaoyanol.practice.leetcode.practice496;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:54
 */
public class Solution {
    /**
     * 暴力
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j =0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j+1;
                    while ( k < nums2.length){
                        if (nums2[k] > nums2[j]) {
                            list.add(nums2[k]);
                        break;
                        }
                        k++;
                    }
                    if (k == nums2.length) {
                        list.add(-1);
                    }
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new int[0]);
    }
}
