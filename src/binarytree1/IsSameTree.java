package binarytree1;

public class IsSameTree
{
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
    static Node n1;
    static Node n2;
    public static boolean isSameTree(Node n1, Node n2)
    {
        if(n1 == null && n2 == null)
        {
            return true;
        }
        if(n1 ==null || n2 == null)
        {
            return false;
        }
        if(n1.data == n2.data)
        {
            return isSameTree(n1.left,n2.left) && isSameTree(n1.right,n2.right);
        }
        return false;
    }

    public static void main(String args[])
    {
        n1 = new Node(1);
        n1.left = new Node(4);
        n1.right = new Node(10);
        n2= new Node(1);
        n2.left = new Node(4);
        n2.right = new Node(10);
        System.out.println("" + isSameTree(n1,n2));
    }

}
