package MD2.Bai12.BaiTap.Bai5;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int key;

    public TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode={key=" + this.key + ", left=" + this.left.key + ", right=" + this.right.key + "}";
    }
}
