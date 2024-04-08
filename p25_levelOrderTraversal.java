class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class BTreeLevelOrder {
    TreeNode root;

    public BTreeLevelOrder() {
        root = null;
    }

    void displayLevelOrder() {
        int treeHeight = treeHeight(root);
        for (int level = 1; level <= treeHeight; level++) {
            displayCurrentLevel(root, level);
        }
    }

    int treeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    void displayCurrentLevel(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.val + " ");
        } else if (level > 1) {
            displayCurrentLevel(node.left, level - 1);
            displayCurrentLevel(node.right, level - 1);
        }
    }

    public static void main(String[] args) {
        BTreeLevelOrder tree = new BTreeLevelOrder();
        // Construct your binary tree here (add nodes)
        // Example:
        // tree.root = new TreeNode(18);
        // tree.root.left = new TreeNode(20);
        // tree.root.right = new TreeNode(30);
        // ...
        tree.displayLevelOrder();
    }
}
