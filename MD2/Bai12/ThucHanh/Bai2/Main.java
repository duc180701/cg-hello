package MD2.Bai12.ThucHanh.Bai2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student1);
        for (Map.Entry<Integer, Student> item : hashMap.entrySet()) {
            System.out.println(item.toString());
        }
        System.out.println("............Set");
        Set<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student1);
        for (Student student : set) {
            System.out.println(student.toString());
        }
    }
}
