package MD2.Bai12.BaiTap.Bai4;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree(27);
        searchTree.insert(14);
        searchTree.insert(35);
        searchTree.insert(10);
        searchTree.insert(19);
        searchTree.insert(31);
        searchTree.insert(42);
        searchTree.preOrder();
    }
}
