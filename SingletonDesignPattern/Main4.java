package SingletonDesignPattern;

public class Main4 {
    public static void main(String[] args) {
        
        PrimeMinister4 pm1=PrimeMinister4.INSTANCE;
        System.out.println(pm1.hashCode());

        PrimeMinister4 pm2=PrimeMinister4.INSTANCE;
        System.out.println(pm2.hashCode());
    }

    //
    
}
