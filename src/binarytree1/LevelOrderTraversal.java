package binarytree1;

import java.util.LinkedList;
import java.util.Queue;

//BinaryTreeInsertion.Node --> imported the Node class

public class LevelOrderTraversal {

    public static void levelOrder(BinaryTreeInsertion.Node root)
    {
        Queue<BinaryTreeInsertion.Node> q = new LinkedList<BinaryTreeInsertion.Node>();
        q.add(root);
        while (!q.isEmpty())
        {
            BinaryTreeInsertion.Node tempNode = q.poll();
            System.out.print(" " + tempNode.data);
            if (tempNode.left != null)
            {
                q.add(tempNode.left);
            }
            if (tempNode.right != null)
            {
                q.add(tempNode.right);
            }
        }
    }
    public static void main(String args[])
    {
        BinaryTreeInsertion.Node root = new BinaryTreeInsertion.Node(1);
        root.left = new BinaryTreeInsertion.Node(4);
        root.left.left = new BinaryTreeInsertion.Node(9);
        root.right = new BinaryTreeInsertion.Node(10);
        root.left.right = new BinaryTreeInsertion.Node(2);
        levelOrder(root);
    }
}
