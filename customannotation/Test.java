package customannotation;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class account = Class.forName("customannotation.Account");
        Annotation[] annotations = account.getAnnotations();
        for (Annotation annotation : annotations) {
            FunctionalInterface functionalInterface = (FunctionalInterface) annotation;
            System.out.println(functionalInterface.getClass());
        }
    }
}
