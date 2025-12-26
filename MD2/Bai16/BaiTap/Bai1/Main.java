package MD2.Bai16.BaiTap.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter from path file:");
        String fromPath = sc.nextLine();
        System.out.println("Enter to path file:");
        String toPath = sc.nextLine();
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.copyTextFile(fromPath, toPath);
    }
}
