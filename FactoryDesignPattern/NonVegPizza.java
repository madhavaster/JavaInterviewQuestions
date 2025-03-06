package FactoryDesignPattern;

public class NonVegPizza implements Pizza {
    @Override
    public void showDetails() {
        System.out.println("preparing non veg pizza");
    }
}
