package FactoryDesignPattern;

public class VegPizza implements Pizza {
    @Override
    public void showDetails() {
        System.out.println("Prepring veg pizza");
    }
}
