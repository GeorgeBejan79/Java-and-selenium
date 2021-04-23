package test.java.java_class.Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {

        int inventory = 100;

        inventory=inventory+50;
        //the resunt will be assigned to the inventory.
        System.out.println(inventory);

        inventory+=50;

        System.out.println(inventory);
        inventory/=4; //inventory =200/4--50

        System.out.println(inventory);

        inventory*=5; // inventory=inventory*5;

        System.out.println(inventory);

        short price = 90;

        price+=42;
        System.out.println(price); //132--

        price/=10;  // price =price/10;
        System.out.println(price);


    }
}
