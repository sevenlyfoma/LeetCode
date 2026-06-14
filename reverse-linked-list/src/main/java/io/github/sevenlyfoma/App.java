package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ListNode ln2 = new ListNode(2, null);
        ListNode ln1 = new ListNode(1, ln2);
        App.reverseList(ln1);
        System.out.println(App.makeString(ln1));
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode previous = null;

        ListNode current = head;

        ListNode temp;

        while (current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        

        return previous;
    }

    public static String makeString(ListNode ln){
        String s = "";

        ListNode next = ln;

        int size = 0;

        while (next != null && size < 20){
            s += next.val;
            s += "-";
            next = next.next;
            size++;
        }


        return s;
    }
}
