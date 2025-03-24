package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main6 {


    public static void main(String[] args) throws Exception {
        PrimeMinister6 pm1=PrimeMinister6.getObject();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(pm1);
        oos.close();
        System.out.println(pm1.hashCode());

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
        PrimeMinister6 pm2=(PrimeMinister6)ois.readObject();
        ois.close();
        System.out.println(pm2.hashCode());

    }

}

    
   
