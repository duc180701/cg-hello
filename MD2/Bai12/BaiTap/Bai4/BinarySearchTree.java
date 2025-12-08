package MD2.Bai12.BaiTap.Bai4;

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

    public void preOrder() {
        preOrderProcess(root);
        System.out.println();
    }

    public void preOrderProcess(TreeNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
        }
        if (node == null) {
            return;
        }
        preOrderProcess(node.left);
        preOrderProcess(node.right);
    }
}
