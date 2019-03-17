import core.TreeNode;

public class Solution112 {

    // path sum : recursive
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (isLeaf(root) && root.val == sum) return true;
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }

    private boolean isLeaf(TreeNode node) {
        return node != null
                && node.left == null
                && node.right == null;
    }

}
