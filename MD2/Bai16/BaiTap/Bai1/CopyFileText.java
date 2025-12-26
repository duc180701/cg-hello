package MD2.Bai16.BaiTap.Bai1;

import java.io.*;

public class CopyFileText {
    public void copyTextFile(String fromPath, String toPath) {
        try {
            File fileInput = new File(fromPath);
            if (!fileInput.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(fileInput));
            String line = "";
            StringBuilder lineResult = new StringBuilder();
            File fileOutPut = new File(toPath);
            if (fileOutPut.exists()) {
                throw new IOException();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutPut, false));
            while ((line = br.readLine()) != null) {
                lineResult.append(line).append("\n");
            }
            bw.write(String.valueOf(lineResult));
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("To File exits!");
        } catch (Exception e) {
            System.out.println("File not found or content error!");;
        }
    }
}
