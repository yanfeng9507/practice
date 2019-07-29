package cn.xiaoyanol.practice.leetcode.practice933;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-27
 * @Time: 上午9:16
 */
public class RecentCounter2 {

    private LinkedList<Integer> queue = new LinkedList<>();

    public RecentCounter2() {
    }

    public int ping(int t) {
        queue.add(t);
        Integer peek = queue.peek();
        while (t - queue.peek() > 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
