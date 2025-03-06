package arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
//        m1();
        int i = m2();
        System.out.println((char)i);
    }

    private static int m2() {
        Map<Character, Integer> hm = new HashMap<>();
        String name = "Madhava Reddy Penthali".toLowerCase();
        for (Character c : name.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        for (Character c : name.toCharArray()) {
            if (hm.get(c) == 1) {
                return c;
            }
        }
        return -1;
    }

    private static void m1() {
        String name = "Madhava Reddy Penthali".toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 97 && c <= 122) {
                int i1 = c - 'a';
                arr[i1]++;
            }
        }
        int index = -1;
        for (Character c : name.toCharArray()) {
            if (c >= 97 && c <= 122 && arr[c - 'a'] == 1) {
                index = c - 'a';
                break;
            }
        }
        System.out.println((char) (index + 97));
    }
}
