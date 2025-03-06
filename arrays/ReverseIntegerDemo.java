package arrays;

public class ReverseIntegerDemo {
    public static void main(String[] args) {
        int reversedNumber = reverseInteger(123);
        System.out.println(reversedNumber);
    }

    public static int reverseInteger(int num) {
        int result = 0;
        while (num > 0) {
            int digit = num % 10;
            result = result * 10 + digit;
            num = num / 10;
        }
        return result;
    }
}
