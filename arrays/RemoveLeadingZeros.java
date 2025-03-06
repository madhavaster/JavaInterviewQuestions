package arrays;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        String number = "000001205";
        String output = "";
        int index = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                index = i;
                break;
            }
        }
        System.out.println(index);
        System.out.println(number.substring(index));
    }
}
