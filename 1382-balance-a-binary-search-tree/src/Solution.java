import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<TreeNode> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        travers(root);
        return balanceBST(0, list.size() - 1);
    }

    private void travers(TreeNode root) {
        if (root == null) {
            return;
        }

        travers(root.left);
        list.add(root);
        travers(root.right);
    }

    private TreeNode balanceBST(int left, int right) {
        if (left > right) {
            return null;
        }
        if (left == right) {
            TreeNode node = list.get(left);
            node.left = null;
            node.right = null;
            return node;
        }
        int mid = (left + right) / 2;
        TreeNode node = list.get(mid);
        node.left = balanceBST(left, mid - 1);
        node.right = balanceBST(mid + 1, right);

        return node;
    }
}
