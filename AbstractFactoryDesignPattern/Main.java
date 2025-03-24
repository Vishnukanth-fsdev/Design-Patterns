package AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        Employee emp1=EmployeeFactory.getEmployee(new JavaDevFactory());
        System.out.println(emp1.designation());
        System.out.println(emp1.salary());

        Employee emp2=EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(emp2.designation());
        System.out.println(emp2.salary());
    }
    
}
