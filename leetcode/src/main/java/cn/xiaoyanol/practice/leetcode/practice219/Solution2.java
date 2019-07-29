package cn.xiaoyanol.practice.leetcode.practice219;

import java.util.HashMap;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午2:41
 */
public class Solution2 {
    // 用hashMap记录索引
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = Optional.ofNullable(map.get(nums[i])).orElse(i);
            if (index != i && i-index <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }
}
