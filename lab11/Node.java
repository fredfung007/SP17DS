package com.rubyalliance.cims.courses.sp17.datastructures.lab11;//CS102 - Data Structures, Dr.Anasse Bari
//Adopted from Data Structures and Algorithms in Java / Edition 2 by Robert Lafore
// tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp

class Node
{
    public int iData;              // data item (key)
    public double dData;           // data item
    public Node leftChild;         // this node's left child
    public Node rightChild;        // this node's right child

    public void displayNode()      // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}