class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Height {
    Node root;

    int maxDepth(Node Node) {
        if (Node == null)
            return 0;
        else {
            int lDepth = maxDepth(Node.left);
            int rDepth = maxDepth(Node.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static void main(String[] args) {
        Height tree = new Height();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(15);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(12);
        tree.root.right.left = new Node(6);
        tree.root.right.left.left = new Node(13);
        tree.root.right.right = new Node(5);
        System.out.println("Height of tree is " + tree.maxDepth(tree.root));
    }
}
