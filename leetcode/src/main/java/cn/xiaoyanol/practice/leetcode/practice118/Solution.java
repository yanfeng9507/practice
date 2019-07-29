package cn.xiaoyanol.practice.leetcode.practice118;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-12
 * @Time: 下午4:47
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if (numRows == 1) {
            return result;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> preList = result.get(i - 1);
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for (int j = 0; j < i + 1; j++) {
                int leftIndex = j - 1;
                int rightIndex = j;
                int leftNum = leftIndex >= 0 ? preList.get(leftIndex) : 0;
                int rightNum = rightIndex < preList.size() ? preList.get(rightIndex) : 0;
                int sum = leftNum + rightNum;
                list.add(sum);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = new Solution().generate(33);
        for (List<Integer> list : generate) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        generate = new Solution().generate(9);
        for (List<Integer> list : generate) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
