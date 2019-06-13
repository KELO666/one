package prac;

import structure.ListNode;

/**
 * @author KELO
 * @date 2019/6/4 - 21:16
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class Merge {
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.getVal() <= list2.getVal()) {
                cur.setNext(list1);
                list1 = list1.getNext();
            } else {
                cur.setNext(list2);
                list2 = list2.getNext();
            }
            cur.setNext(cur);
        }
        if (list1 != null)
            list1 = list1.getNext();
        if (list2 != null)
            cur.setNext(list2);
        return head.getNext();


    }
}
