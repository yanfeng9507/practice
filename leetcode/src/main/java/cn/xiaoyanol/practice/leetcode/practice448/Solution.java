package cn.xiaoyanol.practice.leetcode.practice448;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午3:53
 */
public class Solution {
    /**
     * 4,3,2,7,8,2,3,1
     * 7,3,2,4,8,2,3,1
     * 3,3,2,4,8,2,7,1
     * 2,3,3,4,8,2,7,1
     * 3,2,3,4,8,2,7,1
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != i+1 && nums[i] != nums[nums[i]-1]) {
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1,1}));
    }
}
