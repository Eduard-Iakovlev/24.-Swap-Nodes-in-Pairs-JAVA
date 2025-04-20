package Service;

import model.ListNode;

public class Check {
    boolean checkLists(ListNode head, ListNode expected){
        if(head == null && expected == null) return true;
        while(head != null && expected != null){
            if(head.val != expected.val) return false;
            head = head.next;
            expected = expected.next;
        }
        if(head != null || expected != null) return false;
        return true;
    }
}
