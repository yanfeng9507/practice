package cn.xiaoyanol.practice.leetcode.practice278;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午11:18
 */
public class Solution /**extends VersionControl **/
{
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            boolean midBool = isBadVersion(mid);
            if (midBool == true) {
                // 不能确定mid的前一位 因此不能-1
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean isBadVersion(int n) {
        return true;
    }
}
