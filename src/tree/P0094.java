// 94. Binary Tree Inorder Traversal

package tree;

import java.util.List;

import tree.P0094TreeNode.TreeNode;

import java.util.ArrayList;

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
class P0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }
    
    public void recursion(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                recursion(root.left, result);
            }
            result.add(root.val);
            if (root.right != null) {
                recursion(root.right, result);
            }
        }
    }
}
