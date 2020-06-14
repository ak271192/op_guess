package com.company.practice;

public class OddNodesForTree {

    static class Node{
        int data;
        Node left, right;

    }

    static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void main(String args[])
    {
        Node root = newNode(1);

        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        printOddNodes(root, true);
    }



    private static void printOddNodes(Node root, boolean isOdd){
        if(root == null){
            return;
        }
        if(isOdd){
            System.out.println(root.data);
        }
        printOddNodes(root.left, !isOdd);
        printOddNodes(root.right, !isOdd);


}
}
