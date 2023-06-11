package BST;

public class FindMinElement {
    public static int findMinElement(Node node)
    {
        Node curr=node;
        if(curr == null)
        {
            return 0;
        }
        if(curr.left==null)
        {
            return curr.data;
        }
        while(curr.left!= null)
        {
            curr=curr.left;
        }
        return curr.data;
    }
    public static void main(String[] args)
    {
        Node root = new Node(25);
        Insert add = new Insert();
        add.insert(root,26);
        add.insert(root,27);
        System.out.println(findMinElement(root));
    }
}
