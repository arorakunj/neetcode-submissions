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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();
        int level = 0;

        if (root == null) {
            return list;
        }

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (level % 2 == 0) {
                    nums.add(node.val);
                } else {
                    nums.add(0, node.val);
                }
                
                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            level++;
            list.add(nums);
        }

        return list;
    }
}