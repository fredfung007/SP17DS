package com.rubyalliance.cims.courses.sp17.datastructures.lab9;

/**
 * Created by fredf on 3/29/2017.
 */
public class PalindromeLinkedList {
    public static ListNode root;
    public static boolean isPalindrome(ListNode head) {
        root = head;
        return (head == null) ? true : _isPalindrome(head);
    }

    public static boolean _isPalindrome(ListNode head) {
        boolean flag = true;
        if (head.next != null) {
            flag = _isPalindrome(head.next);
        }
        if (flag && root.value == head.value) {
            root = root.next;
            return true;
        }
        return false;
    }
}
