package binarytree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalArrayList {

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
    public static List<List<Integer>> levelOrder(Node root){

        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();

            List<Integer> l = new ArrayList<Integer>();

            for(int i =0;i<level;i++){
                Node tempNode = q.poll();
                l.add(tempNode.data);
                if(tempNode.left!=null){
                    q.add(tempNode.left);
                }
                if(tempNode.right!=null){
                    q.add(tempNode.right);
                }
            }
            list.add(l);

        }
        return list;
    }
    public static void main(String args[]){
        root = new Node(10);
        root.left = new Node(4);
        root.left.left = new Node(9);
        root.right = new Node(10);
        root.left.right = new Node(2);
        List<List<Integer>> list = levelOrder(root);
        for(List<Integer> level : list) {
            System.out.print(level);
        }
    }
}
