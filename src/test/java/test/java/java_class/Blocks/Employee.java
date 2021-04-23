package test.java.java_class.Blocks;
import java.util.Random;
import java.time.LocalDate;
public class Employee {
    String employeeID;
    String name;
    int age;
    double salary;
    String department;
    String companyName;
    static double budget;// 1_000_000

    static{   // it will run bf everything inside the class and will only run one time.
    System.out.println("this is static initialization block.");
    budget=1_000_000;
    }

    {//instance block will run bf every object and set the value for instance variables.
        System.out.println("this is instance initialization block.");
        employeeID=generateID();
        department="HR";
        companyName="Techtorial";

        System.out.println("Closing instance block");

    }

    public Employee(){  //constructor
        System.out.println("This is no argument constructor");
        salary=50_000;

    }
    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.employeeID=generateID();
        System.out.println("This is three argument constructor");
        budget-=salary;
    }
    public String generateID(){
        Random random =new Random();
        String id=""+ LocalDate.now()+"-";
        for (int i = 0; i <5 ; i++) {
            id+=random.nextInt(10); // generates numbers btw 0-9;

        }
        return id;
    }

}
