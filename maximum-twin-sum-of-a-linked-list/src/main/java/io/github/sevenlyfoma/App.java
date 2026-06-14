package io.github.sevenlyfoma;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ListNode ln6 = new ListNode(6, null);
        ListNode ln5 = new ListNode(5, ln6);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
       
        System.out.println(App.pairSum(ln1));
    }

    public static int pairSum(ListNode head) {
        //This version is faster because we reverse the front half rather than the back half
        //Saving n/2 iterations
        if (head.next.next == null){
            return (head.val + head.next.val);
        }

        int size = 0;
        int halfSize = 0;

        ListNode next = head;
        ListNode halfNode = head;
        ListNode previous = null;
        ListNode temp;


        while (next != null){
            next = next.next;
            size ++;

            if (size/2 > halfSize){
                halfSize++;

                temp = halfNode.next;
                halfNode.next = previous;
                previous = halfNode;
                halfNode = temp;
                
            }
        }
        
        int i = 0;
        int max = 0;

        ListNode x = previous;
        ListNode y = halfNode;

        while (i < size/2){

            int sum = x.val + y.val;
            if (sum > max){
                max = sum;
            }

            x = x.next;
            y = y.next;

            i++;
        }   


        return max;
    }

    public static int pairSumSlow(ListNode head) {
        if (head.next.next == null){
            return (head.val + head.next.val);
        }
        int size = 0;
        int halfSize = 0;

        ListNode next = head;
        ListNode halfNode = head;
        while (next != null){
            next = next.next;
            size ++;

            if (size/2 > halfSize){
                halfSize++;
                if (next==null){
                    ListNode temp = halfNode;
                    halfNode = halfNode.next;
                    temp.next = null; 
                }
                else{
                    halfNode = halfNode.next;
                }
                
            }
        }


        ListNode reversed = reverseList(halfNode);
        

        int i = 0;
        int max = 0;

        ListNode x = head;
        ListNode y = reversed;

        while (i < size/2){

            int sum = x.val + y.val;
            if (sum > max){
                max = sum;
            }

            x = x.next;
            y = y.next;

            i++;
        }   


        return max;
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
