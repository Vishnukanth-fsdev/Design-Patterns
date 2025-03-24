package AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{

    @Override
    public String designation() {
        System.out.println("Web Developer");
        return "WEB DEVELOPER";
    }

    @Override
    public int salary() {
        return 50000;
    }
    
}
