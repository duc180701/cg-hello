package MD2.Bai12.BaiTap.Bai3;

import MD2.Bai12.ThucHanh.Bai4.Tree;

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

    public void delete(int element) {
        TreeNode removeNode = null;
        TreeNode parentDeleteNode = findParentDeleteNode(root, element);
        if (parentDeleteNode == null) {
            System.out.println("Node want remove not found!");
            return;
        }
        if (parentDeleteNode.left.key == element) {
            removeNode = parentDeleteNode.left;
        } else if (parentDeleteNode.right.key == element) {
            removeNode = parentDeleteNode.right;
        }
        if (removeNode == null) {
            System.out.println("Node want remove not found!");
            return;
        }
        if (removeNode.right == null && removeNode.left == null) {
            deleteLeafNode(parentDeleteNode, removeNode);
        } else if (removeNode.right != null && removeNode.left != null) {
            deleteTwoChildNode(parentDeleteNode, removeNode);
        } else {
            deleteOneChildNode(parentDeleteNode, removeNode);
        }
    }

    public void deleteLeafNode(TreeNode parent, TreeNode removeNode) {
        if (parent.right.key == removeNode.key) {
            parent.right = null;
        } else {
            parent.left = null;
        }
    }

    public void deleteOneChildNode(TreeNode parent, TreeNode removeNode) {
        TreeNode keepNode = removeNode.right != null ? removeNode.right : removeNode.left;
        if (parent.right.key == removeNode.key) {
            parent.right = keepNode;
        } else {
            parent.left = keepNode;
        }
    }

    public void deleteTwoChildNode(TreeNode parent, TreeNode removeNode) {
        TreeNode successor = removeNode.right; //nho nhat phan phai
        TreeNode parentSuccessor = removeNode;
        while (successor.left != null) {
            parentSuccessor = successor;
            successor = successor.left;
        }
        successor.left = parentSuccessor.left;
        if (parent.right.key == removeNode.key) {
            parent.right = successor;
        } else {
            parent.left = successor;
        }
    }

    public TreeNode findParentDeleteNode (TreeNode temp, int element) {
        if (temp.left == null && temp.right == null) {
            return null;
        }
        if (temp.left.key == element || temp.right.key == element) {
            return temp;
        }
        if (element < temp.key) {
            temp = findParentDeleteNode(temp.left, element);
        } else if (element > temp.key) {
            temp = findParentDeleteNode(temp.right, element);
        }
        return temp;
    }
}
