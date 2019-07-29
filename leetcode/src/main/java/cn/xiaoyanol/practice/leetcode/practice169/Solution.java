package cn.xiaoyanol.practice.leetcode.practice169;

import java.util.HashMap;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 三种正常思路解法，
 * 贪心算法，O(n) 给遇到的数计数, 相同+1 不同-1, 为0的时候换新数
 * 排序,O(nlogn)
 * 排序优化, O(nlogn) 只利用快排的partition思想,会比排序好一些
 * 其他的啥hashSet, 暴力计数,不太好, 不说了
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午3:07
 */
public class Solution {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = Optional.ofNullable(map.get(num)).orElse(0);
            count++;
            if (count == nums.length/2+1) {
                return num;
            }
            map.put(num, count);
        }
        return 0;
    }


    //贪心算法，O(n) 给遇到的数计数, 相同+1 不同-1, 为0的时候换新数
    public int majorityElement2(int[] nums) {
        int count = 0;
        int key = nums[0];
        for (int num : nums) {
            if (num == key) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    key = num;
                    count++;
                }
            }
        }
        return key;
    }
}
