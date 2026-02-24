package MD2.Bai17.BaiTap.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManage {
    public static List<Product> readFromFile(String path) {
        List<Product> products = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not found!");
            return products;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Read file error!!!");
        }
        return products;
    }

    public static void writeToFile(String path, List<Product> products) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
        } catch (Exception e) {
            System.out.println("Read file error!!!");
        }
    }

    public static void add(String path, Product product) {
        List<Product> productList = readFromFile(path);
        productList.add(product);
        writeToFile(path, productList);
    }

    public static void show(String path) {
        List<Product> products = readFromFile(path);
        if (products.isEmpty()) {
            System.out.println("List empty!");
            return;
        }
        System.out.println("---------------");
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("---------------");
    }

    public static void getProduct(String path, String id) {
        List<Product> products = readFromFile(path);
        for (Product product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                System.out.println(product.toString());
                return;
            }
        }
        System.out.println("Product with id = " + id + " not found!");
    }
}
