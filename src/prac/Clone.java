package prac;

import structure.RandomListNode;

/**
 * @author KELO
 * @date 2019/6/7
 * 输入一个复杂链表
 * （每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 1.插入结点
 * 2.复制random关系
 * 3.拆分
 *
 */
public class Clone {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null) return null;
        //插入结点
        RandomListNode cur = pHead;
        while (cur!=null){
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = clone.next;
        }
        //复制关系
        cur = pHead;
        while (cur!=null){
            RandomListNode clone = cur.next;
            if (cur.random!=null){
                clone.random = cur.random.next;
            }
            cur = clone.next;
        }
        //拆分
        cur = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (cur.next != null){
            RandomListNode next = cur.next;
            cur.next = next.next;
            cur = next;
        }
        return pCloneHead;
    }
}
