package arrays;

public class PalindromeDemo {
    public static void main(String[] args) {
//        boolean palindrome = isPalindrome(12322);
        boolean palindrome = isPalindrome2(12321);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome2(int x) {
        int n = x;
        int revNum = 0;
        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }

        return x == revNum;
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        String num = String.valueOf(number);
        int length = num.length();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
