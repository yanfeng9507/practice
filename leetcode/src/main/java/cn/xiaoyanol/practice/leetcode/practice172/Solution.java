package cn.xiaoyanol.practice.leetcode.practice172;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *452137076
 4019
 * @Author: chenyanfeng
 * @Date: 2019-05-16
 * @Time: 下午4:22
 */
public class Solution {
    /**
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n/5;
            n = n/5;
        }
        return count;
    }



    public static void main(String[] args) {
        System.out.println(new Solution().trailingZeroes(1808548329));

    }
}
