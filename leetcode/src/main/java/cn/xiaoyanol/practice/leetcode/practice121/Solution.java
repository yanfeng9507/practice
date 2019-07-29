package cn.xiaoyanol.practice.leetcode.practice121;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-14
 * @Time: 下午7:36
 */
public class Solution {
//    暴力
//    public int maxProfit(int[] prices) {
//        int result = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                int temp = prices[j] - prices[i];
//                result = Math.max(temp, result);
//            }
//        }
//        return result;
//    }
    public int maxProfit(int[] prices) {
        int result = 0;
        int temp = 0;
        for (int i = 1; i < prices.length; i++) {
            temp += prices[i] - prices[i-1];
            if ( temp > 0) {
                result = Math.max(result, temp);
            }else {
                temp=0;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int i = new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}
