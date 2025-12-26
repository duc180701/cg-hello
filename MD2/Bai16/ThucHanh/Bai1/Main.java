package MD2.Bai16.ThucHanh.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter path file:");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
