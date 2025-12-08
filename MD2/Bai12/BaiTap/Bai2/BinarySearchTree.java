package MD2.Bai12.BaiTap.Bai2;

public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree(int key) {
        root = new TreeNode(key);
    }

    public void insert(int element) {
        insertProcess(root, element);
    }

    public TreeNode insertProcess(TreeNode root, int element) {
        if (root == null) {
            root = new TreeNode(element);
            return root;
        }
        if (element < root.key) {
            root.left = insertProcess(root.left, element);
        } else if (element > root.key) {
            root.right = insertProcess(root.right, element);
        }
        return root;
    }

    public void postOrder() {
        postOrderProcess(root);
        System.out.println();
    }

    public void postOrderProcess(TreeNode node) {
        if (node == null) return;
        postOrderProcess(node.left);
        postOrderProcess(node.right);
        System.out.println(node.key + " ");
    }
}
