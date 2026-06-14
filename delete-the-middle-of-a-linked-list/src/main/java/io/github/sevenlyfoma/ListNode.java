package io.github.sevenlyfoma;

public class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}