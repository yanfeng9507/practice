package cn.xiaoyanol.practice.leetcode.practice485;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 下午7:29
 */
public class Solution2 {

    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuffer sb = new StringBuffer();
        for (int num : nums) {
            sb.append(num);
        }
        String[] split = sb.toString().split("0");
        int max = 0;
        for (String s : split) {
            max = Math.max(s.length(), max);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new Solution2().findMaxConsecutiveOnes(new int[]{1,1,0,1,0,0}));
    }
}
