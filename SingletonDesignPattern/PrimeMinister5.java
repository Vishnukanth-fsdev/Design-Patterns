package SingletonDesignPattern;

public class PrimeMinister5 {

    private static PrimeMinister5 pm;

    private PrimeMinister5(){

        if(pm!=null){
            throw new RuntimeException("You are trying to break singlton desgign pattern");
        }

    }

    public static PrimeMinister5 getObject(){
        if(pm==null){
            synchronized(PrimeMinister5.class){
                if(pm==null){
                    pm=new PrimeMinister5();
                }
            }
        }
        return pm;
        
    }
    
}
