package test.java.java_class.Encapsulation;
public class City {

    private String name;
    private long population;
    private String state;
    private String date;

    /*GETTER--> it doesn't take any parameter and will return the value from the instance variable
    //It will return the value from the instance variable
    //Method naming convention for getters is starting with get
    //All getters and setters has public access modifiers.*/

    public String getName(){
        return name;
    }
    public long getPopulation(){
        return population;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPopulation(long population){
        this.population=population;
    }
    //this vs this()
    //this keyword refer
}
