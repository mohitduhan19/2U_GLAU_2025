package U.Lec24_PCPH;

public class kth_smallest_element {
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
    int count = 0 , temp = 0;
    public void inorder(TreeNode root , int k){
        if(root == null)return;

        inorder(root.left , k);
        count++;
        if(count == k){
            temp = root.val;
        }
        inorder(root.right , k);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)return 0;
        inorder(root ,k);
        return temp;
    }
}
