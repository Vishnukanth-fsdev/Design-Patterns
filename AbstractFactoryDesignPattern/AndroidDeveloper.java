package AbstractFactoryDesignPattern;

public class AndroidDeveloper implements Employee{

    @Override
    public String designation() {
      System.out.println("Android Developer");
      return "ANDROID DEVELOPER";
    }

    @Override
    public int salary() {
        return 80000;
    }
    
}
