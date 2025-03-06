package generics;

public class Test {
    public static void main(String[] args) {
        Madhav<String> obj = new Madhav<>();
        String s = obj.m1("Reddy");
        System.out.println(s);
    }
}
