package BST;

public class DeleteNode {
        public Node deleteNode(Node root, int key) {
            if (root == null) {
                return null;
            }
            if (root.data == key) {
                return helper(root);
            }
            Node dummy = root;
            while (root != null) {
                if (root.data > key) {
                    if (root.left != null && root.left.data == key) {
                        root.left = helper(root.left);
                        break;
                    } else {
                        root = root.left;
                    }
                } else {
                    if (root.right != null && root.right.data == key) {
                        root.right = helper(root.right);
                        break;
                    } else {
                        root = root.right;
                    }
                }
            }
            return dummy;
        }
        public Node helper(Node root) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                Node rightChild = root.right;
                Node lastRight = findLastRight(root.left);
                lastRight.right = rightChild;
                return root.left;
            }
        }
        public Node findLastRight(Node root) {
            if (root.right == null) {
                return root;
            }
            return findLastRight(root.right);
        }
        public static void main(String[] args)
        {

            System.out.println();
        }
    }

