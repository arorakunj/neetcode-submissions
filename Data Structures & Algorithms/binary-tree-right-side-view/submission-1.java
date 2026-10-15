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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> nums = new ArrayList<>();

        if (root == null) {
            return nums;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null && node.right != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else if (node.left != null && node.right == null) {
                    queue.offer(node.left);
                } else if (node.left == null && node.right != null) {
                    queue.offer(node.right);
                }

                if (i == size - 1) {
                    nums.add(node.val);
                }
            }
        }

        return nums;
    }
}
