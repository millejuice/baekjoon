package pps;

class B10 {
    int maxDim=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int left=0;
        int right=0;
        dfs(root);
        return maxDim;
    }

    public int dfs(TreeNode node){
        if(node==null) return 0;
        int left_lvl=dfs(node.left);
        int right_lvl=dfs(node.right);
        maxDim=Math.max(maxDim,left_lvl+right_lvl);
        return Math.max(left_lvl,right_lvl)+1;
    }
}
