

public class MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        // Stop condition: If there is no tree here, the depth is 0
        if (root == null) {
            return 0;
        }

        // Go down the entire left side and count how deep it is
        int leftDepth = maxDepth(root.left);

        // Go down the entire right side and count how deep it is
        int rightDepth = maxDepth(root.right);

        // Take the bigger number between the left and right sides.
        // Add 1 to count the current node we are standing on.
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println("Maximum Depth: " + solution.maxDepth(root1));

    }
}