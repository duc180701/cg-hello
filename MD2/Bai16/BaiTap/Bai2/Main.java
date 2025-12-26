package MD2.Bai16.BaiTap.Bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path file:");
        String pathFile = sc.nextLine();
        List<National> nationals = readFile(pathFile);
        printList(nationals);
    }

    public static List<National> readFile(String pathFile) {
        List<National> list = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found!");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] lineSplit = line.split(",");
                list.add(new National(Integer.parseInt(lineSplit[0]),
                    lineSplit[1].replace("\"", " "),
                    lineSplit[2].replace("\"", " ")));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void printList(List<National> list) {
        for (National national : list) {
            System.out.println("-----------");
            System.out.println("ID: " + national.getId() +
                    "\nCode: " + national.getCode() +
                    "\nName: " + national.getName());
        }
    }
}
