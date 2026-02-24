package MD2.Bai17.ThucHanh.Bai1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath = sc.nextLine();
        System.out.println("Enter dest file:");
        String destPath = sc.nextLine();

        File source = new File(sourcePath);
        File dest = new File(destPath);

        try {
//            copyFileUsingJava7Files(source, dest);
            copyFileUsingStream(source, dest);
            System.out.println("Copy complete");
        } catch (IOException io) {
            System.out.print("Can't copy file");
            System.out.println(io.getMessage());
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
