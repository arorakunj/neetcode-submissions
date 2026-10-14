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
        if (root == null) {
            return false;
        }

        boolean left = isValidBST(root.left);
        boolean right = isValidBST(root.right);

        if (root.left == null || root.right == null) {
            return false;
        }

        if (root.left.val < root.val) {
            left = true;
        } else {
            left = false;
        }

        if (root.right.val > root.val) {
            right = true;
        } else {
            right = false;
        }

        if (right == true && left == true) {
            return true;
        }

        return false;
    }
}
