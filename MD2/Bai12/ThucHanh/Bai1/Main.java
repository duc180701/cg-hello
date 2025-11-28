package MD2.Bai12.ThucHanh.Bai1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Levi", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in Hashmap:");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key:");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Levi", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("The age for " + "Lewis is " + linkedHashMap.get("Levi"));
        System.out.println("Display entries in LinkedHashMap:");
        System.out.println(linkedHashMap);
    }
}
