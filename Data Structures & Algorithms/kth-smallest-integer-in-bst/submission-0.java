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
    int count = 0;
    int value = -1;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);

        return value;
    }

    public boolean inOrder(TreeNode node, int k) {
        if (node == null) {
            return false;
        }

        inOrder(node.left, k);

        count++;

        if (count == k) {
            value = node.val;
            return true;
        }

        inOrder(node.right, k);

        return false;
    }
}
