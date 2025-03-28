package U.Lec21_Theory;

public class count_leaf_nodes {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeaves(root.left) + countLeaves(root.right);
    }
}
