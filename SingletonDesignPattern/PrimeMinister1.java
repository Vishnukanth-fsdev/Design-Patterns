package SingletonDesignPattern;

//Eager Loading Singleton Design Pattern Example
public class PrimeMinister1 {

    private static PrimeMinister1 pm=new PrimeMinister1();

    public static PrimeMinister1 getObject() throws NullPointerException{
        return pm;
    }

    
}
