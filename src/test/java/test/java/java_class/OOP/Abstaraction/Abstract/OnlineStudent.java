package test.java.java_class.OOP.Abstaraction.Abstract;

public class OnlineStudent extends Student{ //---> concrete class
    //while we are implementing the abstract method
    // we need to follow overridden rules
    String id;
    public OnlineStudent(){
        super("Online", 25);
        this.id="12345";
    }
    public void attend(){
        System.out.println("Online students are attending");
    }
    public void speak(){
        System.out.println("Online students are speaking");
    }
}
