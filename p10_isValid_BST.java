class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidateBST {
    public static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (val <= lower || val >= upper) {
            return false;
        }

        if (!isValidBSTHelper(node.right, val, upper)) {
            return false;
        }
        if (!isValidBSTHelper(node.left, lower, val)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean isValid = isValidBST(root);
        System.out.println("Is the binary tree a valid BST? " + isValid);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        isValid = isValidBST(root2);
        System.out.println("Is the binary tree a valid BST? " + isValid);
    }
}
