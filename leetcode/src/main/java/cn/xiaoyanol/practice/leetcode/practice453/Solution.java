package cn.xiaoyanol.practice.leetcode.practice453;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 下午4:28
 */
public class Solution {
    //n-1个数同时加一，就好比每次有一个数自身减一，因为只能做减法，
    // 所以数组最后的数只能是最小值。这样的话每个元素减去最小值求其和就是答案。
    public int minMoves(int[] nums) {

        int min = nums[0];
        for (int num : nums) {
            min = num > min  ? min : num;
        }
        int sum = 0;
        for (int num : nums) {
            sum +=num-min;
        }
        return sum;
    }

    //另外一种考虑
    /**
     *建立方程等式,设至少需要移动x次
     *那么最后达到平衡的那个数为(数组最小值+x)
     *所以平衡后数组元素之和为N*(数组最小值+x)
     *移动过程中增加了x*(N-1)
     *得：初始数组各元素之和+x*(N-1)=N*(数组最小值+x)
     *求出x即可
     */
}
