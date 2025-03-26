package U.Lec19_PCPH;


import U.Lec18_Theory.Pre_order_trav;

public class Symmetric_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean ismirror(TreeNode p , TreeNode q){
        if(p == null && q== null)return true;
        if(p == null || q ==null)return false;
        if(p.val != q.val)return false;

        return ismirror(p.left , q.right) && ismirror(p.right , q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root.left , root.right);
    }

}
