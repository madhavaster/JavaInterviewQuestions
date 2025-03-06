import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> ageValidator = new Function<>() {
            @Override
            public Integer apply(Integer age) {
                return age + 5;
            }
        };
        Integer result1 = ageValidator.apply(21);
        System.out.println(result1);
//        List<String> fruits = List.of("Apple", "Mango", "Banana", "Watermelon", "Pineapple", "Grapes");
//        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana", "Watermelon", "Pineapple", "Grapes");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Orange");
        fruits.add("Peach");
        //remove Mango from the list
//        List<String> result = approach1(fruits);
//        List<String> result = apporach2(fruits);
//        List<String> result = resultList(fruits);
//        List<String> result = approach5(fruits);
        List<String> result = apporach4(fruits);

        System.out.println(result);
    }

    public static List<String> approach5(List<String> fruits) {
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase("Mango")) {
                fruits.remove(fruit);
            }
        }
        return fruits;
    }

    public static List<String> apporach4(List<String> fruits) {
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase("Mango")) {
//                fruits.remove("Mango");
                iterator.remove();
            }
        }
        return fruits;
    }

    public static List<String> apporach2(List<String> fruits) {
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase("Mango")) {
                fruits.remove("Mango");
            }
        }
        return fruits;
    }

    public static List<String> approach1(List<String> fruits) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equalsIgnoreCase("Mango")) {
                fruits.remove(i);
            }
        }
        return fruits;
    }

    public static List<String> resultList(List<String> fruits) {
        List<String> fruitsList = fruits.stream()
                .filter(fruit -> !fruit.equalsIgnoreCase("Mango"))
                .toList();
        return fruitsList;
    }
}
