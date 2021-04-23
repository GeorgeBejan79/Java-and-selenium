package test.java.java_class.Constructor;

public class Car {
   public void move(){
       System.out.println("The car is moving");
   }

    public static void main(String[] args) {
        Car car1=new Car();
        car1=null;
        System.gc();
        car1.move();  //nullpointerexeption
       /* new Car();
        System.gc();
        Car car2=car1;
        String [] names=new String[5];*/
    }
}
