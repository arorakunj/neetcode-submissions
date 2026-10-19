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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (traverseLeft(root.left) - traverseRight(root.right) > 1) {
            return false;
        }

        if (traverseRight(root.right) - traverseLeft(root.left) > 1) {
            return false;
        }

        return true;
    }

    public int traverseLeft(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = traverseLeft(node.left);
        int right = traverseLeft(node.right);

        return Math.max(left, right) + 1;
    }

    public int traverseRight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = traverseRight(node.left);
        int right = traverseRight(node.right);

        return Math.max(left, right) + 1;
    }
}
