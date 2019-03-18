import core.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution114 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }


    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        dfs(node.left, list);
        dfs(node.right, list);
    }

}
