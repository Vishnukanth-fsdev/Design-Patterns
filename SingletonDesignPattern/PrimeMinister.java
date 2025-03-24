package SingletonDesignPattern;


//Lazy Loading Singleton Design Pattern Example
class PrimeMinister{

    private static PrimeMinister pm;

    private PrimeMinister(){

    }

    public static PrimeMinister getObject(){
        if(pm==null){
            pm=new PrimeMinister();
        }
        return pm;
    }
}