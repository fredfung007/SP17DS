/**
 * Created by fredf on 3/29/2017.
 */
public class PlusOne {
    public static void plusOne(ListNode head) {
        if (head.value != 9) {
            head.value++;
        } else {
            head.value = 0;
            if (head.next!=null){
                plusOne(head.next);
            } else {
                head.next = new ListNode(1);
            }
        }
    }
}
