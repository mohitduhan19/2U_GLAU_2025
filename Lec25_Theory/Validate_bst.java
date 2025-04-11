package U.Lec25_Theory;

import U.Lec24_Lab.convert_sorted_array_bst;

public class Validate_bst {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean help(TreeNode root , long minval  , long maxval){
        if(root == null)return true;
        if(root.val <= minval || root.val >= maxval)return false;
        return help(root.left , minval , root.val) && help(root.right , root.val , maxval);


    }
    public boolean isValidBST(TreeNode root) {
        return help(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }
}
