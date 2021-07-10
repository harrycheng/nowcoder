package com.hc.nowcoder;

public class FindKthToTailSolution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        ListNode list =  FindFirstCommonNode.ArrayToListNodeTail( array);
        new FindFirstCommonNode().printListNode(list);
        System.out.println( new FindKthToTailSolution().FindKthToTail(list, 1).val);
    }

    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        int listLength = 0;
        ListNode p = pHead;
        while (p != null) {
            p = p.next;
            listLength++;
        }

        if (k > listLength) {
            return null;
        }
        p = pHead;
        for (int i = 0; i < listLength - k ; i++) {
            p = p.next;
        }
        return p;
    }
}
