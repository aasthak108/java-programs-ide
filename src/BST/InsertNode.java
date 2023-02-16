package BST;

public class InsertNode {
    static void insertNode(Node node, int data) {
        if(node == null)
        {
             node = new Node(data);
        }
        if (data < node.data) {
            if (node.left != null) {
                insertNode(node.left, data);
            } else {
                node.left = new Node(data);
            }
        }
        if (data > node.data) {
            if (node.right != null) {
                insertNode(node.right, data);
            } else {
                node.right = new Node(data);
            }
        }
    }
    public static void print(Node node) {
        if (node == null) {
            System.out.println("Tree is empty");
        } else {
            if (node.left != null) {
                print(node.left);
            }
            System.out.println(node.data + " ");
            if (node.right != null) {
                print(node.right);
            }
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(3);
        insertNode(root,1);
        insertNode(root,5);
        insertNode(root,2);
        insertNode(root,6);
        print(root);
    }
}
