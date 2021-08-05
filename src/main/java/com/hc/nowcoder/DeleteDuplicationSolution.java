package com.hc.nowcoder;

public class DeleteDuplicationSolution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode preNode = pHead;
        ListNode cur = pHead;
        ListNode nextNode = cur.next;

        while (cur != null && nextNode != null) {


            if (nextNode.val == cur.val) {
                cur = cur.next;
                preNode.next = cur;
                continue;
            } else {
                preNode = cur;
                cur = cur.next;
                continue;
            }
        }
        return pHead;
    }
}
