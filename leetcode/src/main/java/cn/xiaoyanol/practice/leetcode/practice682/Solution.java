package cn.xiaoyanol.practice.leetcode.practice682;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-24
 * @Time: 下午7:57
 */
public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();

        for (String s : ops) {
            if ("+".equals(s)) {
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else if ("D".equals(s)) {
                list.add(2*list.get(list.size()-1));
            }else if ("C".equals(s)) {
                list.remove(list.size()-1);
            }else {
                list.add(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for (int num : list) {
            sum +=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(new Solution().calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
