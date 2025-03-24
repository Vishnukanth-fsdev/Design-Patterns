package BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {
        
      Car car1=new CarBuilder().setCarName("Swift").setEngine("Desiel").setWheels(5).setAirBags(true).build();

      System.out.println(car1);

      Car car2=new CarBuilder().setCarName("XUV 500").setAirBags(true).setEngine("petrol").setWheels(4).build();
      System.out.println(car2);
    }
    
}
