package pps;

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
class B11 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        return mergeIt(root1,root2);
    }

    public TreeNode mergeIt(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return null;
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        TreeNode newNode = new TreeNode(root1.val + root2.val);
        newNode.left = mergeIt(root1.left, root2.left);
        newNode.right = mergeIt(root1.right, root2.right);
        
        return newNode;
    }
}
