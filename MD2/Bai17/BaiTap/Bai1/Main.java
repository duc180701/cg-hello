package MD2.Bai17.BaiTap.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path file:");
        String path = sc.nextLine();
        int exitFlag = 0;
        while (exitFlag == 0) {
            System.out.println("\n--- PRODUCT MANAGER ---");
            System.out.println("1. Add product");
            System.out.println("2. Show products");
            System.out.println("3. Search product");
            System.out.println("4. Exit");
            System.out.println("5. Change path file");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("ID:");
                    String id = sc.nextLine();
                    System.out.println("Name:");
                    String name = sc.nextLine();
                    System.out.println("Company:");
                    String company = sc.nextLine();
                    System.out.println("Price:");
                    String price = sc.nextLine();
                    System.out.println("Description:");
                    String description = sc.nextLine();

                    Product product = new Product(id, name, company, price, description);
                    ProductManage.add(path, product);
                    System.out.println("Add product successful!");
                    break;
                case 2:
                    ProductManage.show(path);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter your ID:");
                    String idSearch = sc.nextLine();
                    ProductManage.getProduct(path, idSearch);
                    break;
                case 4:
                    exitFlag = 1;
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Enter path file:");
                    path = sc.nextLine();
                    break;
            }
        }
    }
}
