package cn.xiaoyanol.practice.leetcode.practice933;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 上午9:16
 */
public class RecentCounter {

    private List<Integer> timeList = new ArrayList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        timeList.add(t);
        Iterator<Integer> iterator = timeList.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (t - next >=0 && t-next <=3000) {
                sum++;
            }else {
                iterator.remove();
            }
        }
        return sum;
    }
}
