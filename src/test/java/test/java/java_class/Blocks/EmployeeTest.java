package test.java.java_class.Blocks;

public class EmployeeTest {
    //static block
    //this is static block
    //budget=1000000
    //instance block
    //This is instance block
    //closing instance
    //no argument constructor
    //three argument constr
    //three argum constructor
    public static void main(String[] args) {
        Employee emp1=new Employee(); //50
        System.out.println(emp1.employeeID);
        Employee emp2=new Employee("David", 27,1_000_000);
        Employee emp3=new Employee(); //50K
        System.out.println(emp2.employeeID);

        System.out.println(emp1.companyName);
        System.out.println(emp2.employeeID);
        System.out.println(emp1.employeeID);
        System.out.println(Employee.budget);
    }
}
