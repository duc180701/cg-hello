package MD2.Bai12.BaiTap.Bai1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {

    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        if (isDuplicate(p.getId())) {
            System.out.println("ID already exists!");
            return;
        }
        productList.add(p);
    }

    public boolean update(int id, String name, long price) {
        if (id < 0) {
            System.out.println("ID is not valid!");
            return false;
        }
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return productList.removeIf(p -> p.getId() == id);
    }

    public void printList() {
        if (productList.isEmpty()) {
            System.out.println("List is empty!");
            System.out.println("-------------");
            return;
        }
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        System.out.println("-------------");
    }

    public void searchProductByName(String name) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found product with name: " + name);
        }
        System.out.println("-------------");
    }

    public void sortByPriceIncrease() {
        productList.sort(Comparator.comparingLong(Product::getPrice));
    }

    public void sortByPriceDecrease() {
        productList.sort((p1, p2) -> Long.compare(p2.getPrice(), p1.getPrice()));
    }

    public boolean isDuplicate(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
