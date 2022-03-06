package com;


public class Main {

    /**
     * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /*
        Creating a new binary tree
         */
        BST<Integer> binarySearchTree = new BST<>();

        /*
        Adding data to binary tree as in UC1.
         */
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        binarySearchTree.add(22);
        binarySearchTree.add(40);
        binarySearchTree.add(60);
        binarySearchTree.add(95);
        binarySearchTree.add(11);
        binarySearchTree.add(65);
        binarySearchTree.add(3);
        binarySearchTree.add(16);
        binarySearchTree.add(63);
        binarySearchTree.add(67);

        System.out.println("Size of tree is " + binarySearchTree.getSize() + ".");

    }
}
