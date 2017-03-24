/**
 * Created by fredf on 3/22/2017.
 */
public class Program {
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i=1;i<100;i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        printLinkedList(head);
        insertAtPosition(head, 20, 1307);
        printLinkedList(head);
        removeAtPosition(head,20);
        printLinkedList(head);
    }

    private static void printLinkedList(ListNode head){
        if (head!=null){
            System.out.print(head.value + " ");
            printLinkedList(head.next);
        }
    }

    private static void insertAtPosition(ListNode head, int index, int value){
        if (head == null){
            return;
        }
        ListNode temp = head;
        for (int i=0;i<index-1;i++){
            if (temp == null){
                return;
            }
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = new ListNode(value);
        temp.next.next = temp2;
    }

    private static void removeAtPosition(ListNode head, int index){
        if (head == null){
            return;
        }
        ListNode temp = head;
        for (int i=0; i< index - 1;i++){
            if (temp == null){
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}
