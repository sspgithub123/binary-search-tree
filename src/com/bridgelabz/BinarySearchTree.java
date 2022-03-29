package com.bridgelabz;

public class BinarySearchTree {

    public static void main(String[] args) {
        System.out.println("Welcome to the binary search tree.");
        NodeBinarySearchTree tree = new NodeBinarySearchTree();
        Node node = new Node();
        tree.insert(node, 56);
        tree.insert(node,30);
        tree.insert(node,70);
        tree.insert(node,22);
        tree.insert(node,40);
        tree.insert(node,11);
        tree.insert(node,3);
        tree.insert(node,16);
        tree.insert(node,60);
        tree.insert(node,95);
        tree.insert(node,65);
        tree.insert(node,63);
        tree.insert(node,67);

        System.out.println(" Element present in the tree :: "+ tree.searchNode(node,63));
        System.out.println();
        System.out.println("Level order traversal of binary tree is ");
        tree.inorderTraversal(node);
    }
}
