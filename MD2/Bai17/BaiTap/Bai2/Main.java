package MD2.Bai17.BaiTap.Bai2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source path:");
        String sourcePath = sc.nextLine();
        System.out.println("Enter target path:");
        String targetPath = sc.nextLine();
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            System.out.println("Source file not found!");
            return;
        }
        if (!targetFile.exists()) {
            System.out.println("Target file not found!");
        } else if (targetFile.exists()) {
            System.out.println("File already exits. Overwrite? (Y/N): ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                long totalBytes = 0;
                try {
                    FileInputStream fis = new FileInputStream(sourceFile);
                    FileOutputStream fos = new FileOutputStream(targetFile);
                    byte[] buffer = new byte[1024];
                    int bytesRead = 0;

                    while ((bytesRead = fis.read(buffer)) != -1) {
                        totalBytes += bytesRead;
                        fos.write(buffer, 0, bytesRead);
                    }

                    System.out.println("Copy file successful!");
                    System.out.println("Number of bytes copied: " + totalBytes);
                } catch (IOException e) {
                    System.out.println("Error while copy file:");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
