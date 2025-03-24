package SingletonDesignPattern;

public class PrimeMinister3 {

    //Breaking Single ton Design Pattern using Reflection Api
    private static PrimeMinister3 pm;

    private PrimeMinister3(){

    }

    public static PrimeMinister3 getObject(){

        if(pm==null){
            synchronized(PrimeMinister3.class){
                if(pm==null){
                    pm=new PrimeMinister3();
                }
            }
        }
        return pm;
    }
    
}
