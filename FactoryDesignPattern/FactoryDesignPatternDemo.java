package FactoryDesignPattern;

public class FactoryDesignPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.preparePizza("nonveg");
        pizza.showDetails();
    }
}
