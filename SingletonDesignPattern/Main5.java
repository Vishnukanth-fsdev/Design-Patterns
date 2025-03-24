package SingletonDesignPattern;

import java.lang.reflect.Constructor;
public class Main5 {

 public static void main(String[] args) throws Exception{
    
    PrimeMinister5 pm1=PrimeMinister5.getObject();
    System.out.println(pm1.hashCode());

    Constructor<PrimeMinister5> con = PrimeMinister5.class.getDeclaredConstructor();
    con.setAccessible(true);
    PrimeMinister5 pm2=con.newInstance();
    System.out.println(pm2.hashCode());


 }
    
}
