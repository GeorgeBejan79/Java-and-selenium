package test.java.java_class.Objects;
public class Icloud {

    String userName;
    String familyName="Hunt";
    //Every object has own family name but this family name is same "Hunt"
    static int storage = 2048; // GB
    //Every object has only one storage and they are sharing the same storage
    public void store(int gb){
        storage-=gb;
        System.out.println("Current empty space is: "+storage);
    }
}
