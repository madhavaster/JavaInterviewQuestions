package FactoryDesignPattern;

public class PizzaFactory {
    public static Pizza preparePizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("veg")) {
            pizza = new VegPizza();
        } else if (type.equalsIgnoreCase("nonveg")) {
            pizza = new NonVegPizza();
        }
        return pizza;
    }
}
