package SingletonDesignPattern;

public class Main7 {
public static void main(String[] args) throws CloneNotSupportedException{
    
    PrimeMinister7 pm1=PrimeMinister7.getObject();
   System.out.println(pm1.hashCode());    

   PrimeMinister7 pm2=(PrimeMinister7)pm1.clone();
   System.out.println(pm2.hashCode());

}
    
}
