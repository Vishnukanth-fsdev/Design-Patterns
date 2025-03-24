package AbstractFactoryDesignPattern;

public class JavaDeveloper implements Employee{

    @Override
    public String designation() {
      System.out.println("Java Developer");
      return "JAVADEVELOPER";
    }

    @Override
    public int salary() {
       return 60000;
    }
    
}
