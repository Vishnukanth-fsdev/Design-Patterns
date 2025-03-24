package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {

        PrimeMinister pm1=PrimeMinister.getObject();
        System.out.println(pm1.hashCode());

        PrimeMinister pm2 =PrimeMinister.getObject();
        System.out.println(pm2.hashCode());
        
        PrimeMinister pm3 =PrimeMinister.getObject();
        System.out.println(pm3.hashCode());
    }
    
}
