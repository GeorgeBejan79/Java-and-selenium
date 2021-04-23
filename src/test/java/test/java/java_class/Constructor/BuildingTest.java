package test.java.java_class.Constructor;

public class BuildingTest {
    public static void main(String[] args) {
        Building b1 = new Building("Willis Tower");
        Building b2 = new Building("Aon Center","200 E Randolph St ste 5200",83);


        //println method calls the toString method
        //if you have two string method inside your class
        //println will call from the Building class
        //If we don't have the two
        System.out.println(b1);
        System.out.println(b2);
    }
}
