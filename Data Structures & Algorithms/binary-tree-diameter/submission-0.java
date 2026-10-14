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
    int maxDiameter = 0;
    int height = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        heightCalc(root);

        return maxDiameter;
    }

    public int heightCalc(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = heightCalc(node.left);
        int right = heightCalc(node.right);

        maxDiameter = left + right;
        height = Math.max(left, right) + 1;

        return height;
    }
}
