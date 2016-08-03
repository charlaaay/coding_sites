/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public int maxDepth(TreeNode root) {
        
        int depth = 0;
        int left = 0;
        int right = 0;
        boolean hasRan = false;
        
        if(root == null){
            return 0;
        }
        left = maxDepth(root.left)+1;
        right = maxDepth(root.right)+1;
        
       
       return right > left ? right : left;
    }
}