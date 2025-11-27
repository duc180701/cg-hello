package MD2.Bai11.BaiTap.Bai2;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();
        String initString = "English is a very important language, and learning English can be a " +
                "very useful skill for many people. Many students learn English every day because " +
                "English helps them find better jobs and better opportunities. When people learn English, " +
                "they can read English books, watch English movies, and talk to English speakers. " +
                "The more English they learn, the more confident they become. English is used in many countries, " +
                "and many companies need workers who can speak English well. " +
                "That is why many people try to practice English again and again to improve their English skills every day.";
        String[] parts = initString.replace(".", "").split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (myMap.containsKey(parts[i].toLowerCase())) {
                int count = myMap.get(parts[i].toLowerCase());
                count += 1;
                myMap.put(parts[i].toLowerCase(), count);
            } else {
                myMap.put(parts[i].toLowerCase(), 0);
            }
        }
        for (Map.Entry<String, Integer> item : myMap.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
