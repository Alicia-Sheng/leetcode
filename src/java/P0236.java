//236. Lowest Common Ancestor of a Binary Tree

package java;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class P0236 {

    TreeNode result = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return result;
    }

    public boolean helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return false;
        }
        boolean middle = false;
        if (node.val == p.val || node.val == q.val) {
            middle = true;;
        }
        boolean left = helper(node.left, p, q);
        boolean right = helper(node.right, p, q);
        if ((middle == true && left == true) || (middle == true && right == true) || (left == true && right == true)) {
            result = node;
        }
        return middle || left || right;
    }
}
