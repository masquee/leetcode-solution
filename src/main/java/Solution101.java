import core.TreeNode;

public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);

    }

    private boolean isSymmetric(TreeNode rootA, TreeNode rootB) {
        if (rootA == null && rootB == null) return true;
        if (rootA != null && rootB != null) {
            if (rootA.val != rootB.val) return false;
            else
                return isSymmetric(rootA.left, rootB.right)
                        && isSymmetric(rootA.right, rootB.left);

        } else return false;
    }

}
