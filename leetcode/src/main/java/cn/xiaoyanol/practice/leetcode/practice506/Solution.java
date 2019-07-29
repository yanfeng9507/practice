package cn.xiaoyanol.practice.leetcode.practice506;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午2:15
 */
public class Solution {

    public String[] findRelativeRanks(int[] nums) {

        Integer[] tempNums = new Integer[nums.length];
        int i = 0;
        for (int num : nums) {
            tempNums[i++] = num;
        }
        Arrays.sort(tempNums, (a,b) -> {return b-a;});
        HashMap<Integer, String> map = new HashMap<>();
        for (i = 0; i < tempNums.length; i++) {
            map.put(tempNums[i], i+1+"");
            if (i == 0) {
                map.put(tempNums[i], "Gold Medal");
            }else if (i == 1) {
                map.put(tempNums[i], "Silver Medal");
            }else if (i ==  2) {
                map.put(tempNums[i], "Bronze Medal");
            }
        }
        String[] res = new String[nums.length];
        for (i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}
