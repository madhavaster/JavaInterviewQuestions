package strings;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
//        m1();
//        m2();
        m3();
    }

    private static void m3() {
        String word = "Spring Boot and Micro Services".toLowerCase();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        var entries = hm.entrySet();
        entries.stream()
                .filter(entry -> !entry.getKey().toString().isBlank() && entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
        hm.forEach((k, v) -> {
            System.out.println("Character " + k + " is " + v + " times");
        });
    }

    private static void m2() {
        String word = "Spring Boot and Micro Services";
        System.out.println(word.length());
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void m1() {
        String word = "Spring Boot and Micro Services";
        int length = word.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
