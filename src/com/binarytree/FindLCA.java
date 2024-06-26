package com.binarytree;


public class FindLCA {
static class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
static Node root;
    public static Node findLCA(Node root, Node a, Node b) {
        if (root == null) {
            return null;
        }
        if (root.data == a.data || root.data == b.data) {
            return root;
        }
        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
    public static void main(String args[]){
        root = new Node(8);
        root.left = new Node(2);
        root.right = new Node(7);
        root.right.right = new Node(6);
        root.left.left = new Node(3);
        Node lca = findLCA(root,root.left,root.right);
        System.out.println(""+ lca.data);
    }
}
