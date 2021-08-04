package com.hc.nowcoder;


import java.util.HashSet;
import java.util.Set;

public class EntryNodeOfLoopSolution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        Set<ListNode> set = new HashSet();
        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            }
            set.add(pHead);
            pHead = pHead.next;
        }

        return null;
    }
}
