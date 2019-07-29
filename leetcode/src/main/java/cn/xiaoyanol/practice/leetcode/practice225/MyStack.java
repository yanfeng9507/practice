package cn.xiaoyanol.practice.leetcode.practice225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-17
 * @Time: 下午3:08
 */
public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList();
        queue2 = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue1.size() != 0) {
            queue1.offer(x);
        }else {
            queue2.offer(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queue1.size() == 0 && queue2.size() > 0) {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }else {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        while (queue1.size() > 0) {
            if (queue1.size() == 1) {

                int num = queue1.peek();
                queue2.offer(queue1.poll());
                return num;
            }
            queue2.offer(queue1.poll());
        }
        while (queue2.size() > 0) {
            if (queue2.size() == 1) {
                int num = queue2.peek();
                queue1.offer(queue2.poll());
                return num;
            }
            queue1.offer(queue2.poll());
        }
        return 0;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int top = myStack.top();
        System.out.println(top);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}
