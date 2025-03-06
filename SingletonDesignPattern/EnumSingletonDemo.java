package SingletonDesignPattern;

public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        instance1.setName("Madhava");
        System.out.println(instance1.hashCode());
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        instance2.setName("Reddy");
        System.out.println(instance2.hashCode());
    }
}
