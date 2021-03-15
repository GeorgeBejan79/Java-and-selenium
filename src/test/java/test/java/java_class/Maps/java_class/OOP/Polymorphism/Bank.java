package test.java.java_class.OOP.Polymorphism;

public class Bank extends Branch {
    String companyName="Bank of America";
    public void loan(){
        System.out.println("you have 1 million limit");
    }
    public void hire(){
        System.out.println(" We can hire the manager");
    }
    public void invest(){
        System.out.println("You can invest up to 1 billion");
    }
    public void openBranch(){
        System.out.println("we can open branch.");
    }
}
