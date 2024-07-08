package binarytree1;

public class MirrorTree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }

    }
    static Node root;
    public static void swap(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static void mirrorTree(Node root){
        if(root == null){
            return;
        }
        mirrorTree(root.left);
        mirrorTree(root.right);
        swap(root);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String args[])
    {
        root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(9);
        root.right = new Node(10);
        root.left.right = new Node(3);
        inorder(root);
        mirrorTree(root);
        inorder(root);

    }

}
