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
    int amtGood = 0;
    
    public int goodNodes(TreeNode root) {
        return preorder(root, root.val);
    }

    public int preorder(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }

        if (node.val >= maxVal) {
            maxVal = node.val;
            amtGood++;
        }      

        preorder(node.left, maxVal);
        preorder(node.right, maxVal);

        return amtGood;
    }
}
