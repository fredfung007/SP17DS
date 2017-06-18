package com.rubyalliance.cims.courses.sp17.datastructures.lab12;//CS102 - Data Structures, Dr.Anasse Bari
//Adopted from Data Structures and Algorithms in Java / Edition 2 by Robert Lafore
// tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp

class TreeNode {
    public int iData;              // data item (key)
    public int value;           // data item
    public TreeNode left;         // this node's left child
    public TreeNode right;        // this node's right child

    public static int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (Math.abs(leftHeight - rightHeight) <= 1)
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
}