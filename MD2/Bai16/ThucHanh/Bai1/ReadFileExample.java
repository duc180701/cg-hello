package MD2.Bai16.ThucHanh.Bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bf.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.err.println("File not found or content error!");
        }
    }
}
