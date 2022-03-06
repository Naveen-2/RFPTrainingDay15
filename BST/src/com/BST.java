package com;

public class BST<K extends Comparable<K>> {

    private MyBinaryNode<K> root;

    /**
     * add - method to add new values to the tree
     *
     * @param key - value to be added to the tree
     */
    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    /**
     *
     * addRecursively - method to call frequently till the new node is placed in our tree
     *
     * @param current - current node to which new nodes are to be added either left or right side
     * @param key - value of the new node to be added to tree
     * @return current node
     */
    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key){
        /*
        current will be null if tree is not having any nodes
        so a new node will be created and considered as root node to the tree
         */
        if(current == null)
            return new MyBinaryNode<>(key);

        /*
        compareResult will store the comparison between value of new node and current node
        based on the result, new node will be placed to left or right of current node
        if both are same value, it'll return current node directly
         */
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0){
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

}
