package test.java.java_class.Constructor;

public class Building {
   String name;
   String address;
   int floor;


   public Building(String name ){
      this.name=name;
   }
   public Building(String name, String address, int floor){
      this.name=name;
      this.address=address;
      this.floor=floor;
   }
public String toString(){
   return "Name"+name+", Address: "+address+"Floor Number: "+floor;
}

}