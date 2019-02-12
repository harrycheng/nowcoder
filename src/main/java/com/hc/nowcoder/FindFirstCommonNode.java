package com.hc.nowcoder;

import java.lang.Math;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class FindFirstCommonNode {
    public static void main(String[] args) {
        FindFirstCommonNode ffcn = new FindFirstCommonNode();
        ListNode p1 = ffcn.ArrayToListNode(new int[]{5, 4, 3, 2, 1});
        ListNode p2 = ffcn.ArrayToListNode(new int[]{9, 8, 7});

        ListNode last = ffcn.findLastNode(p2);
        last.next = p1.next.next;

        ffcn.printListNode(p1);
        ffcn.printListNode(p2);

        ListNode commonStart = ffcn.FindFirstCommonNode(p1, p2);
        ffcn.printListNode(commonStart);
    }

    public void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(String.format("%d ", head.val));
            head = head.next;
        }
        System.out.println(" ");
    }

    public ListNode findLastNode(ListNode head) {
        if(head == null){
            return null;
        }
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }

    public ListNode ArrayToListNode(int[] intArray) {
        ListNode head = null;
        for (int i : intArray) {
            ListNode node = new ListNode(i);
            ListNode temp = head;
            head = node;
            node.next = temp;
        }
        return head;
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length = CountLength(pHead1);
        int length2 = CountLength(pHead2);
        int gap = Math.abs(length - length2);

        ListNode pLonger = length > length2 ? pHead1 : pHead2;
        ListNode pShorter = length < length2 ? pHead1 : pHead2;
        for (; gap > 0; gap--) {
            pLonger = pLonger.next;
        }

        while (pLonger != pShorter) {
            pLonger = pLonger.next;
            pShorter = pShorter.next;
        }
        return pShorter;
    }

    private int CountLength(ListNode pHead) {
        int temp = 0;
        while (pHead != null) {
            pHead = pHead.next;
            temp++;
        }
        return temp;
    }
}
