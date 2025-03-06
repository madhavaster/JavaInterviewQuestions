package arrays;

import java.util.Stack;

public class ValidParenthesisDemo {

    public static boolean isValidParenthesis(String input) {
        Stack<Character> stack = new Stack<>();
        char[] inputCharArray = input.toCharArray();
        for (Character c : inputCharArray) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                Character peek = stack.peek();
                if (c - peek == 1 || c - peek == 2) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean validParenthesis = isValidParenthesis("[({)}]");
        System.out.println(validParenthesis);
    }
}
