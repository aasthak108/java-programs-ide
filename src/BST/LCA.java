package BST;

public class LCA {
    static Node lca(Node node,int n1,int n2){
        if(node==null)
        {
            return null;
        }
        if(node.data>n1 && node.data>n2)
        {
            return lca(node.left,n1,n2);
        }
        if(node.data<n1 && node.data<n2)
        {
            return lca(node.right,n1,n2);
        }
        return node;
    }
    public static void main(String args[]){
    Node root = new Node(8);
    Insert add = new Insert();
    add.insert(root,7);
    add.insert(root,10);
    add.insert(root,3);
    add.insert(root,4);
    Node n = lca(root,3,4);
    System.out.println(""+ n.data);
    }
}
