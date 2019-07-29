package cn.xiaoyanol.practice.leetcode.practice461;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 上午9:11
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;
        int count = 0;
        while (tmp !=0) {
            count++;
            tmp &=tmp-1;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
