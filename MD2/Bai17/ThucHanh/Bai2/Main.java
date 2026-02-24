package MD2.Bai17.ThucHanh.Bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("1", "Lê Sang Hiếc", "T1"));
        studentList.add(new Student("2", "Trần Trung Đức", "Thái Bình"));
        studentList.add(new Student("3", "Đại Văn Mỗ", "Hà Đông"));
        studentList.add(new Student("4", "Ngọc Thị Đại", "Thanh Xuân"));
        studentList.add(new Student("5", "Bộ Công An", "Phạm Văn Đồng"));

        System.out.println("Enter path file:");
        String path = sc.nextLine();
        writeToFile(path, studentList);

        List<Student> outputList = readFromFile(path);
        for (Student item : outputList) {
            System.out.println(item.toString());
        }
    }

    public static void writeToFile(String path, List<Student> list) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public static List<Student> readFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException io) {
            System.out.println(io.getMessage());
        }
        return students;
    }
}
