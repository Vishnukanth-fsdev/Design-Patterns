package SingletonDesignPattern;

public class Main1 {
    public static void main(String[] args) {
        
        PrimeMinister1 pm1=PrimeMinister1.getObject();
        System.out.println(pm1.hashCode());

        PrimeMinister1 pm2=PrimeMinister1.getObject();
        System.out.println(pm2.hashCode());
   }
    
}
