package MD2.Bai12.BaiTap.Bai3;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree(50);
        searchTree.insert(30);
        searchTree.insert(70);
        searchTree.insert(20);
        searchTree.insert(40);
        searchTree.insert(60);
        searchTree.insert(80);
        searchTree.insert(25);
        searchTree.insert(55);
        searchTree.insert(65);
        searchTree.insert(75);
        searchTree.insert(85);
        searchTree.postOrder();

        searchTree.delete(30);
        searchTree.postOrder();
    }
}
