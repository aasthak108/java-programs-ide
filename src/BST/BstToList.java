package BST;
class TreeNode
{
    TreeNode left;
    TreeNode right;
    int data;
    TreeNode(int x)
    {
        left=null;
        right=null;
        data=x;
    }
}
public class BstToList {
    static TreeNode root;
    static void bstToList(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

            TreeNode tempLeft = root.left;
            TreeNode tempRight = root.right;
            root.left = null;
            bstToList(tempLeft);
            bstToList(tempRight);
            root.right = tempLeft;
            TreeNode curr = root;
            while (curr.right != null) {
                curr = curr.right;
            }
                curr.right = tempRight;
    }
    public static void inOrder(TreeNode node)
    {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public static void main(String[] args)
    {
        BstToList tree = new BstToList();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(4);
        tree.root.left.left = new TreeNode(3);
        tree.root.right = new TreeNode(5);
        tree.root.right.right =new TreeNode(6);
        bstToList(tree.root);
        inOrder(tree.root);
    }


}
