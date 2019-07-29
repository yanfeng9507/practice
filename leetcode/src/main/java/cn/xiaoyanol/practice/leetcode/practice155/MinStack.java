package cn.xiaoyanol.practice.leetcode.practice155;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-15
 * @Time: 上午10:26
 */
public class MinStack {

    LinkedList<Integer> valueStack;
    LinkedList<Integer> minValueStack;
    /** initialize your data structure here. */
    public MinStack() {
        valueStack = new LinkedList<>();
        minValueStack = new LinkedList<>();
    }

    public void push(int x) {
        valueStack.push(x);
        if (minValueStack.size() == 0) {
            minValueStack.push(x);
        }else {
            Integer peek = minValueStack.peek();
            if (peek < x) {
                minValueStack.push(peek);
            }else {
                minValueStack.push(x);
            }
        }
    }

    public void pop() {
        valueStack.pop();
        minValueStack.pop();
    }

    public int top() {
        return valueStack.peek();
    }

    public int getMin() {
        return minValueStack.peek();
    }
}
