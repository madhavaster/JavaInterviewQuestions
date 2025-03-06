package java8programs;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };

        int result = arithmeticOperation.performOperation(2, 3);
        System.out.println(result);
    }
}
