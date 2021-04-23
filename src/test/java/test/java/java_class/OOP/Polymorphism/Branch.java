package test.java.java_class.OOP.Polymorphism;

public class Branch extends ATM{
public void loan(){
    System.out.println("you can get the loan up to 50K");
}
public void hire(){
    System.out.println("we can hire bank teller");
}
public void withdraw(){
    System.out.println("we can withraw money up to 15k");
}
public void deposit(){
    System.out.println("you can deposit up to 100k");
}
}
