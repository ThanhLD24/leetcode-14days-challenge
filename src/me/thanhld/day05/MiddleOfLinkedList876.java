package me.thanhld.day05;


import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleOfLinkedList876 {
    public static ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;
        int count = 0;
        ListNode reserveNode = null;
        while (head != null) {
            if (count == 0) {
                reserveNode = new ListNode(head.val, null);
            } else {
                reserveNode = new ListNode(head.val, reserveNode);
            }
            head = head.next;
            count++;
        }
        int take = count / 2 + count % 2;
        ListNode output = null;
        while (take > 0) {
            if (output == null)
                output = new ListNode(reserveNode.val, null);
            else
                output = new ListNode(reserveNode.val, output);
            reserveNode = reserveNode.next;
            take--;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        ListNode node = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            node = new ListNode(arr[i], i == arr.length ? null : node);
        }
        middleNode(node);
    }
}
