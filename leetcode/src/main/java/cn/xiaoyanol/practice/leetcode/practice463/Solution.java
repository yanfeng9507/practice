package cn.xiaoyanol.practice.leetcode.practice463;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-20
 * @Time: 上午9:16
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    // 前
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        sum--;
                    }
                    // 后
                    if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                        sum--;
                    }
                    // 左
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        sum--;
                    }
                    // 右
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                        sum--;
                    }
                }
            }
        }
        return sum;
    }
}
