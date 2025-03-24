package FactoryDesignPattern;

public class BabyCornPizza implements Pizza {

    @Override
    public void prepare() {
       System.out.println("BabyCornPizza Pizza Preparing");
    }

    @Override
    public void bake() {
       System.out.println("BabyCornPizza Pizza baking");
    }

    @Override
    public void cut() {
        System.out.println("BabyCornPizza Pizza Cutting");
    }
    @Override
    public void box() {
        System.out.println("BabyCornPizza Pizza boxing");
    }
    
}
