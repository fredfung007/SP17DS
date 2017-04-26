//CS102 - Data Structures, Dr.Anasse Bari
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
        if (root == null)
            return -1;

        int leftDepth = height(root.left);
        int rightDepth = height(root.right);

        int bigger = Math.max(leftDepth, rightDepth);

        return bigger + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        return height(root) != -1;
    }
}