package strings;

public class ReverseAString {
    public static void main(String[] args) {
        String inputStr = "Madhav";
        String outputStr = reverse(inputStr);
        System.out.println(outputStr);
    }

    public static String reverse(String inputStr) {
        char[] chars = inputStr.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(chars);
    }
}
