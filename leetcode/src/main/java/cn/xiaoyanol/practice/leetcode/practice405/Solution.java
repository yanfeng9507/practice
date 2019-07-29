package cn.xiaoyanol.practice.leetcode.practice405;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-19
 * @Time: 上午12:29
 */
public class Solution {

    public String toHex(int num) {
        if(num == 0) {
            return "0";
        }
        int n = 15;// 1111
        StringBuffer sb = new StringBuffer();
        HashMap<Integer, Character> map = new HashMap();
        map.put(0, '0');
        map.put(1, '1');
        map.put(2, '2');
        map.put(3, '3');
        map.put(4, '4');
        map.put(5, '5');
        map.put(6, '6');
        map.put(7, '7');
        map.put(8, '8');
        map.put(9, '9');
        map.put(10, 'a');
        map.put(11, 'b');
        map.put(12, 'c');
        map.put(13, 'd');
        map.put(14, 'e');
        map.put(15, 'f');

        while (num != 0) {
            sb.append(map.get(num & n));
            num >>>=4;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
    }
}
