import core.TreeNode;

public class Solution112V2 {


    public boolean hasPathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return hasPathSum;
    }

    private boolean hasPathSum = false;

    private void dfs(TreeNode root, int sum) {
        if (root == null) return;
        if (isLeaf(root) && root.val == sum) hasPathSum = true;
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
    }

    private boolean isLeaf(TreeNode node) {
        return node != null
                && node.left == null
                && node.right == null;
    }

}
