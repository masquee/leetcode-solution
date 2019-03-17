
public class Solution112 {


    public class TreeNode {

        int val;

        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

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
