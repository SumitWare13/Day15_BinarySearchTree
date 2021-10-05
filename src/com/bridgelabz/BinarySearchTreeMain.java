package com.bridgelabz;

public class BinarySearchTreeMain {
    public static void main(String[] args){
        System.out.println("Welcome To The Binary Search Tree Program");
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();
        myTree.add(56);
        myTree.add(30);
        myTree.add(70);
        myTree.add(22);
        myTree.add(40);
        myTree.add(11);
        myTree.add(3);
        myTree.add(16);
        myTree.add(60);
        myTree.add(95);
        myTree.add(65);
        myTree.add(63);
        myTree.add(67);
        myTree.print(myTree.root);
        boolean flag = myTree.search(63);
        if (flag == true)
            System.out.println("\n63 is present");
        else
            System.out.println("\n63 is not present");
    }
}