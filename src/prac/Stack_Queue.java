package prac;

import java.util.Stack;

/**
 * @author KELO
 * @date 2019/6/4 - 16:42
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class Stack_Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //栈1负责入栈
        stack1.push(node);
    }

    public int pop() throws Exception {
        //栈2负责出栈
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            throw new Exception("queue is empty");
        }
        return stack2.pop();
    }
}
