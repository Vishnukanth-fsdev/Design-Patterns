package FactoryDesignPattern;

public class PizzaFactory {

    public static Object createPizza(String type){
        if(type.trim().equalsIgnoreCase("MargeritaPizza")){
            return new MargeritaPizza();
        }
        else if(type.trim().equalsIgnoreCase("BabyCornPizza")){
            return new BabyCornPizza();
        }
        else{
        return null;
        }
    }
}