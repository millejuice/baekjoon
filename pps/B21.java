package pps;

import java.util.ArrayList;
import java.util.List;

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
class B21 {
    static List<Integer> answer;
    public List<Integer> inorderTraversal(TreeNode root) {
        answer=new ArrayList<>();
        dfs(root);
        return answer;
    }

    static public void dfs(TreeNode node){
        if(node==null) return;
        if(node.left!=null) dfs(node.left);
        answer.add(node.val);
        if(node.right!=null) dfs(node.right);
    }
}
