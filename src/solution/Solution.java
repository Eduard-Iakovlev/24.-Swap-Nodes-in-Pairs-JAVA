package solution;

import model.ListNode;

import java.util.List;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode domain = new ListNode(0, head);
        ListNode prev = domain;
        ListNode current = head;

        while(current != null && current.next != null){
            prev.next = current.next;
            current.next = prev.next.next;
            prev.next.next = current;

            prev = current;
            current = current.next;
        }
        return domain.next;
    }

}
