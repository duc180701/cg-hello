package MD2.Bai16.ThucHanh.Bai2;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path file:");
        String path = sc.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(path);
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile(path, maxValue);
    }
}
