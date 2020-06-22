package 链表分割;

import java.util.List;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/22 22:04
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Partition {
    public static ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode cur = pHead;
        ListNode smallHead = null;
        ListNode smallTail = null;
        ListNode bigHead = null;
        ListNode bigTail = null;
        while (cur != null) {
            if (cur.val < x) {
                if (smallHead == null) {
                    smallHead = cur;
                    smallTail = cur;
                }else {
                    smallTail.next = cur;
                    smallTail = smallTail.next;
                }
            }else {
                if (bigHead == null) {
                    bigHead = cur;
                    bigTail = cur;
                }else {
                    bigTail.next = cur;
                    bigTail = bigTail.next;
                }
            }
            cur = cur.next;
        }
        //big里面没有东西，全在small
        if (smallHead == null) {
            return bigHead;
        }else {//否则进行拼接
            smallTail.next = bigHead;
            //如果big里面有东西，即bigHead != null,把bigTail.next置为null
            if (bigHead != null) {
                bigTail.next = null;
            }
            //返回拼接后的
            return smallHead;
        }
    }

    public static void insert(ListNode head, int val) {
        ListNode node = new ListNode(val);
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        for (int i = 8; i > 0; i--) {
            insert(head,i);
        }
        print(head);
        ListNode newHed = partition(head,5);
        print(newHed);
    }
}
