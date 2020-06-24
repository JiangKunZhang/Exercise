package 链式AaddB;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/24 22:46
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Plus {

    private ListNode head = null;

    public static ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode curA = a;
        ListNode curB = b;
        int low = 0;
        int high = 0;
        ListNode head = null;
        ListNode tail = null;
        while (a != null && b != null) {
            int numA =
            low = (a.val + b.val + high) % 10;
            high = (a.val + b.val + high) / 10;
            ListNode node = new ListNode(low);
            if (head == null) {
                head = node;
                tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
            a = a.next;
            b = b.next;
        }
        while (a != null) {
            low = (a.val + high) % 10;
            high = (a.val + high) / 10;
            ListNode node = new ListNode(low);
            if (head == null) {
                head = node;
                tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
            a = a.next;
        }
        while (b != null) {
            low = (b.val + high) % 10;
            high = (b.val + high) / 10;
            ListNode node = new ListNode(low);
            if (head == null) {
                head = node;
                tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
            b = b.next;
        }
        if (high != 0) {
            ListNode node = new ListNode(high);
            if (head == null) {
                head = node;
                tail = node;
            }else {
                tail.next = node;
                tail = tail.next;
            }
        }
        return head;
    }

    public static void insert(ListNode head, int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(1);
        a1.next = a2;a2.next = a3;a3.next = a4;
        b1.next = b2;b2.next = b3;
        ListNode res = plusAB(a1,b1);
    }
}
