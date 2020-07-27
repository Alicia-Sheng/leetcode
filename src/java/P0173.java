//173. Binary Search Tree Iterator

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
class BSTIterator {

    List<Integer> nodes;
    int index;

    public BSTIterator(TreeNode root) {
        nodes = new ArrayList<Integer>();
        index = -1;
        inorder(root);
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        nodes.add(root.val);
        inorder(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        index++;
        return nodes.get(index);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return index + 1 < nodes.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
