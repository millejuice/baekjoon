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
class B9 {
    public boolean isBalanced(TreeNode root) {
        int left_lvl=0;
        int right_lvl=0;
        if(root==null) return true;
        // root 기준 right 과 left로 나눠서 DFS
        if(root.left!=null) {left_lvl=dfs(root.left);}
        if(root.right!=null) {right_lvl=dfs(root.right);}
        if (Math.abs(left_lvl - right_lvl) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int dfs(TreeNode node){
        if(node==null) return 0;
        int left=dfs(node.left);
        int right=dfs(node.right);
        return Math.max(left,right)+1;
    }
}
