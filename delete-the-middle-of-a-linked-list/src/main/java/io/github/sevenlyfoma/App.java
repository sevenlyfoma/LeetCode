package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ListNode ln4 = new ListNode(4, null);
        ListNode ln3 = new ListNode(4, ln4);
        ListNode ln2 = new ListNode(4, ln3);
        ListNode ln = new ListNode(4, ln2);
        App.deleteMiddle(ln);
        System.out.println( "Hello World!" );
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head==null){return null;}

        int size = 0;

        int middle = 0;

        ListNode previous = null;
        ListNode target = head;

        ListNode next = head;
        while (next != null){
            size++;
            next = next.next;

            if (size/2 > middle){
                previous = target;
                target = target.next;
                middle++;
            }
        }
        

        if (previous == null){
            return target.next;
        }
        else{
            previous.next = target.next;
        }

        return head;
    }

    public static ListNode deleteMiddleSlow(ListNode head) {
        if (head==null){return null;}

        int size = 1;

        ListNode next = head;
        while (next.next != null){
            size++;
            next = next.next;
        }
        
        ListNode previous = null;
        ListNode target = head;
        for (int i = 0; i < size/2; i++){
            previous = target;
            target = target.next;
        }

        if (previous == null){
            return target.next;
        }
        else{
            previous.next = target.next;
        }

        return head;
    }
}
