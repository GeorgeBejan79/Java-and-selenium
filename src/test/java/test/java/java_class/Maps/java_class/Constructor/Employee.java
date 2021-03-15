package test.java.java_class.Constructor;

public class Employee {
    String name;
    int age;
    String companyAddress;
    String companyName;
    String managerName;
    public Employee(){
        this("Serhat",24);
    }

    public Employee(String name, int age){
        this(name, age, "2200 E Devon", "Techtorial","Muammer");
        this.name=name;
        this.age=age;
    }
    public Employee(String name, int age, String companyAddress, String companyName, String managerName){
        this.name=name;
        this.age=age;
        this.companyAddress=companyAddress;
        this.companyName=companyName;
        this.managerName=managerName;
        this.run();
    }
    public void run(){}

    public static void main(String[] args) {
        Employee emp1=new Employee("Olivia",25);// first two are conected with same address manager...
            System.out.println(emp1.companyAddress);
        Employee emp2=new Employee("David",27);
            System.out.println(emp2.companyAddress);
        Employee emp3=new Employee("Khusal",27,"204 Devon Ave","Marianos", "Marcus");// this one reasingn differenta address manager..
            System.out.println(emp3.companyAddress);

        Employee emp4=new Employee();
            System.out.println(emp4.companyAddress);
            System.out.println(emp4.companyName);
            System.out.println(emp4.name);

    }
}
