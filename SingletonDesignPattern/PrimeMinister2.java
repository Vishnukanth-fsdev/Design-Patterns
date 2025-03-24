package SingletonDesignPattern;

public class PrimeMinister2 {

    private static PrimeMinister2 pm;

    private PrimeMinister2(){

    }
   //Here we done Method Synchronized
    // public static synchronized PrimeMinister2 getObject(){
    //     if(pm==null){
    //         pm=new PrimeMinister2();
    //     }
    //     return pm;
    // }

    //Here we done Syncronization Block

    public static PrimeMinister2 getObject(){
        if(pm==null){
            synchronized(PrimeMinister2.class){
                if(pm==null){
                    pm=new PrimeMinister2();
                }
               
            }
            
        }
        return pm;
    }
    
}
