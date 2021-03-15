package test.java.java_class.OOP.Abstaraction.Abstract;

public class Classroom {
    public static void main(String[] args) {
        //Student student=new Student("David", 34) -->BC of the abstract class{
        OnCampusStudents oncampus= new OnCampusStudents();
        System.out.println(oncampus.name);
        System.out.println(oncampus.city);
        OnlineStudent online=new OnlineStudent();
        System.out.println(online.name);
        //System.out.println(online.city);
        //city is not available inside the online class
//and inside parent class which is Student
        System.out.println(online.id);
        }
    }

