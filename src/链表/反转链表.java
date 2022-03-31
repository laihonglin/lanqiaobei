package 链表;

import java.util.Scanner;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 * 示例：
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class 反转链表 {
    static ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        head = createList();
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        ListNode cur = head.next;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
        System.out.println("反转后:");
        ListNode reverseNode = reverseList(head);
        while (reverseNode != head) {
            System.out.print(reverseNode.val + " ");
            reverseNode = reverseNode.next;
        }
    }

    private static ListNode createList() {
        head = new ListNode(0);
        head.next = null;
        return head;
    }

    //尾插法
    private static void insert(int x) {
        ListNode node = new ListNode(x);
        node.next = null;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
