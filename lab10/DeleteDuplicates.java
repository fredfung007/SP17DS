package com.rubyalliance.cims.courses.sp17.datastructures.lab10;

/**
 * Created by fredf on 4/12/2017.
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.value == current.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
