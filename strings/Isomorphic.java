package strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("foo", "bar");
        System.out.println(isomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

}
