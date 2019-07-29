package cn.xiaoyanol.practice.leetcode.practice599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-22
 * @Time: 下午7:24
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            Integer index = map.get(list2[i]);
            if (index != null ) {
                if( i + index < min) {
                    list.clear();
                    list.add(list2[i]);
                    min = i + index;
                }else if ( i + index == min) {
                    list.add(list2[i]);
                }
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
