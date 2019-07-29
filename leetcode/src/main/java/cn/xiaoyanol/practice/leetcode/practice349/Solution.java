package cn.xiaoyanol.practice.leetcode.practice349;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:28
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> numsSet1 = new HashSet<>();
        HashSet<Integer> numsSet2 = new HashSet<>();
        for (int num : nums1) {
            numsSet1.add(num);
        }
        for (int num : nums2) {
            numsSet2.add(num);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int num : numsSet1) {
            if ( !numsSet2.add(num) ){
                res.add(num);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for (int num : res) {
            arr[i++] = num;
        }
        return arr;
    }
}
