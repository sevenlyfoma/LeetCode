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
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        App.oddEvenList(ln1);

        System.out.print(makeString(ln1));
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        boolean notFinished = true;

        while (notFinished){
            if (even.next == null){
                notFinished = false;
            }
            else{
                odd.next = even.next;
                odd = odd.next;

                if (odd.next == null){
                    notFinished = false;
                }
                else{
                    even.next = odd.next;
                    even = even.next;
                }

            }
        }

        odd.next = evenHead;
        even.next = null;
        
        return head;
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
