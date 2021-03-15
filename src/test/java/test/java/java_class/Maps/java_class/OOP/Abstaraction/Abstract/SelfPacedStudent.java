package test.java.java_class.OOP.Abstaraction.Abstract;

public abstract class SelfPacedStudent extends Student{

    public SelfPacedStudent(String name, int age){
        super(name, age);
        // inside this class we dont need to implement the
        //bc selfpacedStudentclass is also abstract class
        //NOTE: first non-abstract class that extends the abstract
        //abstract method
    }
    abstract void learn();
}
