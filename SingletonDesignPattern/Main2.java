package SingletonDesignPattern;

public class Main2 {

    public static void main(String[] args) {
        
        PrimeMinister2 pm1=PrimeMinister2.getObject();
        System.out.println(pm1.hashCode());

        PrimeMinister2 pm2=PrimeMinister2.getObject();
        System.out.println(pm2.hashCode());
    }
    
}
