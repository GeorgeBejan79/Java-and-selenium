package test.java.java_class.OOP.Abstaraction.Abstract;

public class SelfLearner extends Student{

    public SelfLearner(){
        super("Self", 22);
    }
    public void attend(){
        System.out.println("Self learner is started to learn ");
    }

    @Override
    public void speak() {
        System.out.println("Self learner making practice");
    }

    public void learn(){
        System.out.println("Self learner finished the topic ");
        // First class that implements the abstract methods from abstract class
        //it is called concrete class
    }
}
