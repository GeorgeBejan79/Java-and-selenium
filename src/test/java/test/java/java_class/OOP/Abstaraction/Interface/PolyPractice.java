package test.java.java_class.OOP.Abstaraction.Interface;

public class PolyPractice {
    public static void main(String[] args) {
        Iphone  iphone=new Iphone();
        iphone.play();//-->play comes from Phone class. It is static method
        iphone.scrollDown();
        iphone.takePhoto();
        iphone.text();


       Phone phone = new Iphone();
       phone.takePhoto();
       phone.text();
       phone.play();

    }
}
