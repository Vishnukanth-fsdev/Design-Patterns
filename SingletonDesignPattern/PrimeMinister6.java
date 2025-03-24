package SingletonDesignPattern;

import java.io.Serializable;

public class PrimeMinister6 implements Serializable{

    private  static PrimeMinister6 pm;

    private PrimeMinister6(){
       
    } 

    public static PrimeMinister6 getObject(){

        if(pm==null){
            synchronized(PrimeMinister6.class){
                if(pm==null){
                    pm=new PrimeMinister6();
                }
            }
        }
        return pm;

    }


  public Object readResolve(){
    return pm;
  }
}
    

