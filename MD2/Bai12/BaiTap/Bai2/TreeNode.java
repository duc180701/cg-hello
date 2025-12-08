package MD2.Bai12.BaiTap.Bai2;

import MD2.Bai12.ThucHanh.Bai4.Tree;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int key;

    public TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}
