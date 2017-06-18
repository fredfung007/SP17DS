package com.rubyalliance.cims.courses.sp17.datastructures.lab12;

/**
 * Created by fred on 4/25/2017.
 *
 * @see <a href="https://discuss.leetcode.com/topic/80823/two-solutions-in-order-traversal-and-a-more-general-way-using-treeset">LeetCode Discussion</a>
 */
public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.value - prev);
        }
        prev = root.value;

        getMinimumDifference(root.right);

        return min;
    }
}
