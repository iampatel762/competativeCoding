class p13_treeTraversal {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(7);
        root.left = new BinaryTree(15);
        root.right = new BinaryTree(10);
        root.left.left = new BinaryTree(12);
        root.right.left = new BinaryTree(6);
        root.right.left.left = new BinaryTree(13);
        root.right.right = new BinaryTree(5);
        
        System.out.println("\nInorder Traversal:");
        inOrderTraversal(root);
        System.out.println("\nPre-order Traversal:");
        preOrderTraversal(root);
        System.out.println("\nPost-order Traversal:");
        postOrderTraversal(root);
    }

    public static void inOrderTraversal(BinaryTree root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(BinaryTree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(BinaryTree root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}

class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
    }
}
