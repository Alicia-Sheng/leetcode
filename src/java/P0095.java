//95. Unique Binary Search Trees II

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
class P0095 {
    public List<TreeNode> generateTrees(int n) {
    if(n < 1){
        return new ArrayList<TreeNode>();
    }
    return generateTreeList(1, n);
    }

    public List<TreeNode> generateTreeList(int start, int end){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(start > end){
            result.add(null);
            return result;
        }

        for(int i = start; i <= end; i++){
            List<TreeNode> left = generateTreeList(start, i-1);
            List<TreeNode> right = generateTreeList(i+1, end);
            for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode curr = new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    result.add(curr);
                }
            }
        }

        return result;
    }
}
