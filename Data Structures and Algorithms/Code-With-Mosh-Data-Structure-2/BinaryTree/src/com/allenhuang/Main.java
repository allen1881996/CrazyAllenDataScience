package com.allenhuang;

public class Main {

    public static void main(String[] args) {
	    // Tree (root)
        // Node (value, leftChild, rightChild)
        // insert(int value)
        // find(value): boolean
        BinaryTree bTree = new BinaryTree();
        bTree.insert(4);
        bTree.insert(10);
        bTree.insert(2);
        bTree.insert(3);
        bTree.insert(5);
        System.out.println("Insert Done");
        System.out.println(bTree.find(11));
        bTree.preOrder();
        System.out.println();
        bTree.inOrder();
        System.out.println();
        System.out.println(bTree.height());
        bTree.insert(1);
        System.out.println(bTree.min());
        System.out.println(bTree.min2());
    }

}
