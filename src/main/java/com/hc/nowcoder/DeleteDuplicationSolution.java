package com.hc.nowcoder;

public class DeleteDuplicationSolution {

    public ListNode deleteDuplication(ListNode pHead) {
        ListNode vhead = new ListNode(-1);
        vhead.next = pHead;
        ListNode pre = vhead, cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return vhead.next;
    }
}
