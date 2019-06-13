package prac;

import structure.ListNode;

import java.util.Stack;

/**
 * @author KELO
 * @date 2019/6/4 - 19:39
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        int count = 0;
        ListNode result = null;
        while (head!=null){
            stack.push(head);
            head = head.getNext();
            count++;
        }
        if(count<k){
            return null;
        }
        for (int i = 0; i < k; i++) {
            result = stack.pop();
        }

        return result;
    }
}
