package cn.xiaoyanol.practice.leetcode.practice401;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午10:53
 */
public class Solution {

    //直接暴力 从0:00-》11:59 直接判断小时位出现的1个数+分秒位出现的1个数 时间复杂度 空间复杂度都是 O(1)
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int i =0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (count1(i) + count1(j) == num) {
                    list.add(i+":"+(j < 10 ? "0"+j: j));
                }
            }
        }
        return list;
    }

    private int count1(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n &=n-1;
        }
        return count;
    }
}
