package cn.xiaoyanol.practice.leetcode.practice728;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-25
 * @Time: 下午1:44
 */
public class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            list.add(i);
            while (temp != 0) {
                if (temp%10 == 0 || i % (temp % 10) != 0 ) {
                    list.remove((Integer)i);
                    break;
                }
                temp = temp/ 10;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().selfDividingNumbers(10, 150));
    }
}
