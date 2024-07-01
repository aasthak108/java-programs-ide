package binarytree1;

//left view of binary tree using level order traversal

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewUsingLevelOrder
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
    static Node root;
    public static void leftView(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        if(root == null)
        {
            return;
        }

        while(!q.isEmpty())
        {
            int n = q.size();

            for(int i=0;i<n;i++){
                Node tempNode = q.poll();
                if( i==0)
                {
                    System.out.println(" " + tempNode.data);
                }
                if(tempNode.left!= null)
                {
                    q.add(tempNode.left);
                }
                if(tempNode.right!= null)
                {
                    q.add(tempNode.right);
                }
            }
        }
    }
    public static void main(String args[])
    {
        root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(9);
        root.right = new Node(10);
        root.left.right = new Node(2);
        leftView(root);
    }

}
