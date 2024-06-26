package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Node root;
    public static void inorder(Node tempNode){
        if(tempNode==null){
            return;
        }
        inorder(tempNode.left);
        System.out.print(" " + tempNode.data);
        inorder(tempNode.right);

    }
    public static void insert(Node tempNode, int data) {
        if (tempNode == null) {
            root = new Node(data);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(tempNode);
        while (!q.isEmpty()) {
            tempNode = q.peek();
            q.remove();
            if (tempNode.left == null) {
                tempNode.left = new Node(data);
                break;
            } else {
                q.add(tempNode.left);
            }
            if (tempNode.right == null) {
                tempNode.right = new Node(data);
                break;
            } else {
                q.add(tempNode.right);
            }
        }

    }

    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        inorder(root);
        insert(root,5);
        inorder(root);
    }
}

