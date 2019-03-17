import core.TreeNode;


public class Solution110 {

    private boolean isBalanced = true; // initial value is true

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) isBalanced = false;
        return 1 + Math.max(leftHeight, rightHeight);
    }

}
