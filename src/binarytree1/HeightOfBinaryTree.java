package binarytree1;

public class HeightOfBinaryTree {

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

    public static int height(Node root){
        if(root== null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) +1;
    }
    public static void main(String args[])
    {
        root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(9);
        root.right = new Node(10);
        root.left.right = new Node(3);
        System.out.println(""+ height(root));
    }
}
