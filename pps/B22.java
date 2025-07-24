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
class B22 {
    static List<Integer> answer;
    public List<Integer> postorderTraversal(TreeNode root) {
        answer=new ArrayList<>();
        dfs(root);
        return answer;
    }

    static public void dfs(TreeNode node){
        if(node==null) return;
        if(node.left==null && node.right==null) {
            answer.add(node.val);
            return ;
        }
        dfs(node.left);
        dfs(node.right);
        answer.add(node.val);
    }
}
