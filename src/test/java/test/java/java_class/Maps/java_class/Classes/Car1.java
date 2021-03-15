package test.java.java_class.Classes;
public class Car1 {
    private int doors;
    private int wheels ;
    private String model;
    private String engine;
    private String colour;

public void setModel(String model){
    String validModel=model.toLowerCase();
    if(validModel.equals("carrera")||validModel.equals("commodore")){
        this.model=model;
    }else{
        this.model="Unknown";
    }

    this.model=model;
}
public  String getModel(){
     return this.model;
}

}
