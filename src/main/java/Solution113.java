
import core.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return Collections.emptyList();
        dfs(root, sum);
        return paths;
    }

    private boolean hasPathSum = false;

    private List<List<Integer>> paths = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    private void dfs(TreeNode root, int sum) {
        if (root == null) return;

        path.add(root.val);

        // 抵达叶节点
        if (isLeaf(root)) {
            if (root.val == sum) {
                hasPathSum = true;
                paths.add(new ArrayList<>(path));
            }
        }

        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
        path.remove(path.size() - 1);
    }

    private boolean isLeaf(TreeNode node) {
        return node != null
                && node.left == null
                && node.right == null;
    }

}
