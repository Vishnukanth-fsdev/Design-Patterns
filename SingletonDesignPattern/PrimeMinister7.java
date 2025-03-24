package SingletonDesignPattern;

public class PrimeMinister7  implements Cloneable{

    private static PrimeMinister7 pm;

    private PrimeMinister7(){

       
    }

    public static PrimeMinister7 getObject(){
        if(pm==null){
            synchronized(PrimeMinister7.class){
                if(pm==null){
                    pm=new PrimeMinister7();
                }
            }
        }
        return pm;
        
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();

    // }
    @Override
    public Object clone(){
        return pm;
    }
    
}
