package cn.xiaoyanol.practice.leetcode.practice704;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-21
 * @Time: 下午3:23
 */
public class Solution {
    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;
        while(left <= right) {
            mid = left+(right-left)/2;
            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) {
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
