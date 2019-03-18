
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

    private void dfs(TreeNode node, int sum) {

        // recursion base case
        if (node == null) return;

        // visit node
        path.add(node.val);
        if (isLeaf(node)) {     // 抵达叶节点
            if (node.val == sum) {
                hasPathSum = true;
                paths.add(new ArrayList<>(path));
            }
        }

        // visit left sub-tree
        dfs(node.left, sum - node.val);

        // visit left sub-tree
        dfs(node.right, sum - node.val);

        // after visit sub-trees, complete visit node
        path.remove(path.size() - 1);
    }

    private boolean isLeaf(TreeNode node) {
        return node != null
                && node.left == null
                && node.right == null;
    }

}
