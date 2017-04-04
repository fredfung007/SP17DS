/**
 * Created by fredf on 3/29/2017.
 */
public class Program {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for (int i = 1; i < 3; i++) {
            temp.next = new ListNode(9);
            temp = temp.next;
        }
        temp.next = new ListNode(1);
        printLinkedList(head);
        System.out.println(PalindromeLinkedList.isPalindrome(head));
        printLinkedList(head);
        PlusOne.plusOne(head);
        printLinkedList(head);
        head = ReverseLinkedList.reverseListIterative(head);
        printLinkedList(head);
        head = ReverseLinkedList.reverseListRecursive(head);
        printLinkedList(head);
        System.out.println(PalindromeLinkedList.isPalindrome(head));
    }

    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
}
