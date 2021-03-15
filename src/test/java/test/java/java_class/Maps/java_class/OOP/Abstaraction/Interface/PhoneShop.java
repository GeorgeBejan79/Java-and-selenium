package test.java.java_class.OOP.Abstaraction.Interface;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();

        iphone.scrollDown();
        iphone.takePhoto();
        iphone.play();
        //iphone.record();
        System.out.println(Memory.CAPACITY);
        System.out.println(iphone.equals(iphone));

        Samsung samsung= new Samsung(); // samsung object
        samsung.scrollDown();
        samsung.takePhoto();  //calling methods for samsung phone
        samsung.play(); // this one comes from Parent class phone
        System.out.println(samsung.equals(samsung));
    }
}
