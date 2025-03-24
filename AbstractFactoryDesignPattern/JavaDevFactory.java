package AbstractFactoryDesignPattern;

public class JavaDevFactory  extends EmployeeAbstractFactory{
    @Override
    public AbstractFactoryDesignPattern.Employee createEmployee() {
        return new JavaDeveloper();
    }
    
}
