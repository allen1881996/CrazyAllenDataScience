package com.allenhuang;

import java.util.Map;

public class BinaryTree {
    private Node root;

    private class Node {
        // The reference to the left and child
        private Node leftChild, rightChild;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    public void insert(int value) {
        var node = new Node(value);
        var current = root;
        if (root == null) {
            root = node;
            return;
        }
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }

        }
    }

    public boolean find(int value) {
        var current = root;
        while (current.value != value) {
            if (current.value > value) {
                if (current.leftChild == null) return false;
                current = current.leftChild;
            }
            else {
                if (current.rightChild == null) return false;
                current = current.rightChild;
            }
        }
        return true;
    }

    private void preOrder(Node root) {
        if (root == null) return;
        // print the root - left - right
        System.out.print(root.value + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void preOrder() {
        preOrder(root);
    }
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node root) {
        while (root == null) return;
        inOrder(root.leftChild);
        System.out.print(root.value + " ");
        inOrder(root.rightChild);
    }

    private int height(Node root) {
        // in the case that our tree is empty
        if (root == null) return -1;
        // the height of leaf root is 0
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild),
                            height(root.rightChild));
    }

    public int height(){
        return height(root);
    }

    private int min(Node root) {
        if (root == null) {
            return 1000000;
        }
        if (isLeaf(root)) return root.value;
        var left = min(root.leftChild);
        var right = min(root.rightChild);
        return Math.min(Math.min(left,right),root.value);
    }

    public int min(){
        return min(root);
    }

    private boolean isLeaf(Node node){
        return node.rightChild == null && node.leftChild == null;
    }

    public int min2() {
        if (root == null) {
            throw new IllegalStateException();
        }
        // only for binary search tree
        // just find the leftmost
        var current = root;
        while (!isLeaf(current)) {
            current = current.leftChild;
        }
        return current.value;
    }

}


