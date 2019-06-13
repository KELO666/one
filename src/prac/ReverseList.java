package prac;

import structure.ListNode;


/**
 * @author KELO
 * @date 2019/6/4 - 20:05
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 *
 * 当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
 * 需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
 * 即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
 * 所以需要用到pre和next两个节点
 * 1->2->3->4->5
 * 1<-2<-3 4->5
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }
}
