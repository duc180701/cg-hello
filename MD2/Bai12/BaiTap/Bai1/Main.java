package MD2.Bai12.BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.printList();

        productManager.add(new Product(1, "Xa Phong", 12000));
        productManager.add(new Product(4, "Sua Tam", 70000));
        productManager.add(new Product(5, "Ban Chai", 7000));
        productManager.add(new Product(2, "Dau Goi", 4000));
        productManager.printList();

        productManager.delete(5);
        productManager.delete(20);
        productManager.printList();

        productManager.searchProductByName("xa phong");
        productManager.searchProductByName("ban chai");

        productManager.sortByPriceIncrease();
        productManager.printList();

        productManager.sortByPriceDecrease();
        productManager.printList();
    }
}
