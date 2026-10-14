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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, 1000000000, -1000000000);
    }

    public boolean isValid(TreeNode node, int max, int min) {
        if (node == null) {
            return true;
        }

        boolean left = isValid(node.left, node.val, min);
        boolean right = isValid(node.right, max, node.val);

        if (node.val < max && node.val > min && left && right) {
            return true;
        }

        return false;
    }
}
