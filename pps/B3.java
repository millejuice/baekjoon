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
class B3 {
   public int sumOfLeftLeaves(TreeNode root) {
       if (root == null) return 0;
       return dfs(root);
   }

   public int dfs(TreeNode node){
       if (node == null) return 0;
       int answer=0;
       if(node.left!=null && node.left.left==null && node.left.right==null){
           answer+=node.left.val;
       }
       answer+=dfs(node.left);
       answer+=dfs(node.right);

       return answer;
   }
}
