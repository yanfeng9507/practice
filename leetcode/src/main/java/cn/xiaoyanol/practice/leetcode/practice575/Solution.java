package cn.xiaoyanol.practice.leetcode.practice575;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午3:38
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        int count = 1;
        int curr = candies[0];
        if(candies.length == 2) {
            return 1;
        }
        for(int i = 1; i < candies.length ; i++) {
            if(candies[i] != curr) {
                count++;
                curr = candies[i];
                if(count == candies.length/2) {
                    return count;
                }
            }
        }
        return count;
    }


    /**
     * 不管有多少种类 先给妹妹一个，如果超过一半 怎最多可以获得一半
     * @param candies
     * @return
     */
    public int distributeCandies2(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < candies.length ;i++ ){
            set.add(candies[i]);
        }
        return Math.min(set.size(),(candies.length /2));
    }
}
