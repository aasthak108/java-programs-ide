package BST;
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
public class SearchInBst {
    static void insert(Node node,int data)
    {
        if(data<node.data) {
            if (node.left != null) {
                insert(node.left, data);
            } else {
                node.left = new Node(data);
            }
        }
        if(data>node.data) {
            if (node.right != null) {
                insert(node.right, data);
            } else {
                node.right = new Node(data);
            }
        }
    }
    static int searchInBst(Node node,int x)
    {
        if(node==null)
        {
            return -1;
        }
        if(x==node.data)
        {
           return 1;
        }
        if(x>node.data)
        {
            return searchInBst(node.right,x);
        }
        if(x<node.data){
            return searchInBst(node.left, x);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Node root = new Node(24);
        insert(root,12);
        insert(root,45);
        insert(root,34);
        insert(root,1);
        System.out.println(searchInBst(root,1));
    }

}
