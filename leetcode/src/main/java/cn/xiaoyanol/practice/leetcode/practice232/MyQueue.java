package cn.xiaoyanol.practice.leetcode.practice232;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午3:35
 */
public class MyQueue {

    private Stack<Integer> inputStack ;
    private Stack<Integer> outStack ;

    /** Initialize your data structure here. */
    public MyQueue() {
        inputStack = new Stack();
        outStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!outStack.empty()) {
            return outStack.pop();
        }
        while (!inputStack.empty()) {
            outStack.push(inputStack.pop());
        }
        return outStack.pop();

    }

    /** Get the front element. */
    public int peek() {
        if (!outStack.empty()) {
            return outStack.peek();
        }
        while (!inputStack.empty()) {
            outStack.push(inputStack.pop());
        }

        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.empty() && outStack.empty();
    }
}
