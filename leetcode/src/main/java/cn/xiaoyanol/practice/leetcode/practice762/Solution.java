package cn.xiaoyanol.practice.leetcode.practice762;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 下午7:25
 */
public class Solution {

    public int countPrimeSetBits(int L, int R) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        set.add(23);
        set.add(29);
        set.add(31);

        int sum = 0;
        int num = L;
        while (num <= R) {
            int tmp = num;
            int count = 0;
            while (tmp > 0) {
                count++;
                tmp = tmp&(tmp-1);
            }
            if (set.contains(count)) {
                sum++;
            }
            num++;
        }
        return sum;
    }
}
