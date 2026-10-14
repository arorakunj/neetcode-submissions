/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p) {
            return p;
        }

        if (root == q) {
            return q;
        }

        TreeNode a = lowestCommonAncestor(root.left, p, q);
        TreeNode b = lowestCommonAncestor(root.right, p, q);

        if (b == null && a != null) {
            return a;
        }

        if (b != null && a == null) {
            return b;
        }

        if (b == null && a == null) {
            return null;
        }

        return root;
    }
}