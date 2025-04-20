package model;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void creatwList(List<Integer> listData){
        if(listData.isEmpty()) return;
        ListNode current = this;
        this.val = listData.get(0);
        for(int i = 1; i < listData.size(); i++){
            current.next = new ListNode(listData.get(i), null);
            current = current.next;
        }
    }

    public void printList(){
        ListNode current = this;
        System.out.print("[ ");
        while(current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" ]");
    }
}
