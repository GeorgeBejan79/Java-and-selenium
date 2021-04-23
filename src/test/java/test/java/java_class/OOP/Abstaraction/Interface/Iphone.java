package test.java.java_class.OOP.Abstaraction.Interface;

public class Iphone extends Phone {

public  void speak(){
    System.out.println("Iphone is speaking");
}
public void scrollDown() {
    System.out.println("Iphone is scrolling down");
}

    @Override
    public void scrollUp() {System.out.println("Iphone is scrolling up");

    }

    public void ScrollUp(){
        System.out.println("Iphone is scrolling up");
    }
    public void text(){
        System.out.println("Iphone is texting");
    }
    protected void takePhoto(){
        System.out.println("iphone is taking photo");
    }

}