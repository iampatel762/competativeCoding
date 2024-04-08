import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LeftViewOfBinaryTree {
    public static void leftView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean isFirstNode = true;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();

                if (isFirstNode) {
                    System.out.print(currNode.val + " ");
                    isFirstNode = false;
                }

                if (currNode.left != null) queue.offer(currNode.left);
                if (currNode.right != null) queue.offer(currNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right.left = new TreeNode(14);

        System.out.print("Left view of the binary tree: ");
        leftView(root);
    }
}
