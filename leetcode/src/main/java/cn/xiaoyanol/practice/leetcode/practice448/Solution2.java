package cn.xiaoyanol.practice.leetcode.practice448;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午4:16
 */
public class Solution2 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            // nums[i]可能为负值 取绝对值 防止负负得正
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        // 最后的正数一定是对应的下标没有出现过
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >0) {
                list.add(i+1);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution2().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

}
