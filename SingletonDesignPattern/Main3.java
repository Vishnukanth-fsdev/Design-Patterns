package SingletonDesignPattern;

import java.lang.reflect.Constructor;

public class Main3 {
    public static void main(String[] args) throws Exception{
        
        Constructor<PrimeMinister3> con= PrimeMinister3.class.getDeclaredConstructor();
        con.setAccessible(true);
        PrimeMinister3 pm1=con.newInstance();
        System.out.println(pm1.hashCode());

        PrimeMinister3 pm2=PrimeMinister3.getObject();
        System.out.println(pm2.hashCode());
        

        //to solve using Enum of Example next PrimeMinister4

    }
    
}
