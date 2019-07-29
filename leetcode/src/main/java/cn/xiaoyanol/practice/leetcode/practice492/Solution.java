package cn.xiaoyanol.practice.leetcode.practice492;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:43
 */
public class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];

        for (int i = (int)Math.sqrt(area); i > 0; i--) {
            if (i * i == area) {
                Arrays.fill(res, i);
                return res;
            }else if (area % i == 0){
                res[0] = area / i;
                res[1] = i;
                return res;
            }
        }
        return res;
    }
}
