

public class InvertBinaryTreeOptimal {

    public TreeNode invertTree(TreeNode root) {
        // Base case: If the tree is empty (or we reach the bottom), stop and return nothing
        if (root == null) {
            return null;
        }

        // Step 1: Swap the left and right branches of the current node
        // We use a temporary variable to hold the left branch while we overwrite it
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Step 2: Tell the computer to repeat this exact same process for the left side
        invertTree(root.left);

        // Step 3: Tell the computer to repeat this exact same process for the right side
        invertTree(root.right);

        // Return the root of the newly inverted tree
        return root;
    }
}