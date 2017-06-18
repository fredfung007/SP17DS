package com.rubyalliance.cims.courses.sp17.datastructures.lab13;

import java.util.Stack;

/**
 * Created by fred on 5/2/2017.
 */
public class Program {

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    /**
     * FOR SOLUTION TO Well-Formed Expression REFER
     * TEXTBOOK SECTION 3.6.
     */
}
