import core.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution114V2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }

        return list;
    }

}
