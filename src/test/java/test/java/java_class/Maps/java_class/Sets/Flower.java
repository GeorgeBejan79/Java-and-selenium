package test.java.java_class.Sets;

public class Flower {
    String name;
    String color;
    //Flower flower=new Flower();
    public Flower(String name, String color) {
        this.name = name;
        this.color=color;
    }

    public String getName() {

        return name;
    }
    public String getColor() {
        return color;}

        public void setName(String name){
        this.name=name;
        }
    public void setColor(String color) {
        this.color = color; }






    public String toString(String name, String color) {
        return "Name: "+name+" Color: "+color;
    }
}
