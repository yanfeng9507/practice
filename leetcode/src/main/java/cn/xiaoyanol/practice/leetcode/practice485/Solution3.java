package cn.xiaoyanol.practice.leetcode.practice485;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:32
 */
public class Solution3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            }else {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new Solution2().findMaxConsecutiveOnes(new int[]{1,1,0,1,0,0}));
    }
}
