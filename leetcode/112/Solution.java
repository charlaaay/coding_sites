/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            //this is a leaf node
            return sum == root.val ? true : false;
        }
        boolean result = false;
        if (root.left != null) {
            result = hasPathSum(root.left, sum - root.val);
        }
        if (!result && root.right != null) {
            result = hasPathSum(root.right, sum - root.val);
        }
        
        return result;
    }
}
