/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder result = new StringBuilder();
        dfs(root, result);
        return result.toString();
    }

    private void dfs(TreeNode node, StringBuilder result) {
        if (node == null) {
            return;
        }

        result.append(node.val);

        if (node.left == null && node.right == null) {
            return;
        }

        result.append('(');
        dfs(node.left, result);
        result.append(')');

        if (node.right != null) {
            result.append('(');
            dfs(node.right, result);
            result.append(')');
        }
    }
}