package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        
      Pizza p1=(Pizza)PizzaFactory.createPizza("MargeritaPizza");
      p1.prepare();
      p1.bake();
      p1.cut();
      p1.box();

      Pizza p2=(Pizza)PizzaFactory.createPizza("BabyCornPizza");
      p2.prepare();
      p2.bake();
      p2.cut();
      p2.box();
      

    }
    
}
