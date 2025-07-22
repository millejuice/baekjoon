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
class Solution {
    public boolean findTarget(TreeNode root, int k) {
       // bfs로 순회 후 없으면 더 내려가기 
       Set<Integer> set = new HashSet<>();
        return bfs(root,k,set);
    }

    public boolean bfs(TreeNode node,int target,Set set){

        if(node==null){return false;}
        if(set.contains(target-node.val)){
            return true;
        }
        set.add(node.val);
        return bfs(node.left,target,set) || bfs(node.right,target,set);
    }
}
