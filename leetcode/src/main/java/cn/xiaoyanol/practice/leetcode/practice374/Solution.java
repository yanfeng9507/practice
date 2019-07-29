package cn.xiaoyanol.practice.leetcode.practice374;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午8:57
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution /**extends GuessGame  **/{
    public int guessNumber(int n) {
        int i = 1;
        int j = n;

        while(i <= j) {
            int mid = i + (j-i)/2;
            if(guess(mid) == 0) {
                return mid;
            }else if(guess(mid) ==-1) {
                j = mid-1;
            }else {
                i = mid+1;
            }
        }
        // 1 10 6 10  6 7
        return 0;
    }

    private int guess(int num) {return 0;}
}
