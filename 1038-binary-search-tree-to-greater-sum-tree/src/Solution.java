public class Solution {
    public TreeNode bstToGst(TreeNode root) {
        bstToGst(root, 0);
        return root;
    }

    private int bstToGst(TreeNode root, int parentVal) {
        if (root == null) {
            return parentVal;
        }

        root.val = root.val + bstToGst(root.right, parentVal);
        if (root.left != null) {
            return bstToGst(root.left, root.val);
        }
        return root.val;
    }
}
