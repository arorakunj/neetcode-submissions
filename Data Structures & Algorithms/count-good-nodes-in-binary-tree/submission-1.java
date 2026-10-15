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
    public int goodNodes(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        int goodNodes = 1;

        if (root == null) {
            return 0;
        }

        q.offer(root);
        int maxValueLeft = root.val;
        int maxValueRight = root.val;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.offer(node.left);

                    if (node.left.val >= maxValueLeft) {
                        goodNodes++;
                        maxValueLeft = node.left.val;
                    }
                }

                if (node.right != null) {
                    q.offer(node.right);

                    if (node.right.val >= maxValueRight) {
                        goodNodes++;
                        maxValueRight = node.right.val;
                    }
                }
            }
        }

        return goodNodes;
    }
}
