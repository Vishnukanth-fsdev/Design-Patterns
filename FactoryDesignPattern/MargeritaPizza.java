package FactoryDesignPattern;

public class MargeritaPizza implements Pizza{

    @Override
    public void prepare() {
       System.out.println("MargeritaPizza Pizza Preparing");
    }

    @Override
    public void bake() {
       System.out.println("MargeritaPizza Pizza baking");
    }

    @Override
    public void cut() {
        System.out.println("MargeritaPizza Pizza Cutting");
    }
    @Override
    public void box() {
        System.out.println("MargeritaPizza Pizza boxing");
    }
    
}
