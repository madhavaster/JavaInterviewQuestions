package arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Madhava Reddy Penthali";
        char[] ch = new char[name.length()];
        for (int i = name.length() - 1; i >= 0; i--) {
            ch[name.length() - i-1] = name.charAt(i);
        }
        System.out.println(ch);
        m1();
    }

    public static void m1(){
        String name = "Madhava Reddy Penthali";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);
    }
}
