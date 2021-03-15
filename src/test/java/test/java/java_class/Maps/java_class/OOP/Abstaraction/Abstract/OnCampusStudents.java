package test.java.java_class.OOP.Abstaraction.Abstract;

public class OnCampusStudents extends Student {
    String city;
    public OnCampusStudents(){
        super("On-campus",30);
        city="Chicago";
    }
    @Override
    void attend() {
        System.out.println("On-Campus is attending");
    }
    public void speak(){
        System.out.println("On-Campus is speaking");
    }
}
