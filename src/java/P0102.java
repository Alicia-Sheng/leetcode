//102. Binary Tree Level Order Traversal

package java;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, root, 0);
        return result;
    }

    public void helper(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (list.size() == level) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(node.val);
        helper(list, node.left, level + 1);
        helper(list, node.right, level + 1);
    }
}
