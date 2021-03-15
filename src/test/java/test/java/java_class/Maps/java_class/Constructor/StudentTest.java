package test.java.java_class.Constructor;

public class StudentTest {
    public static void main(String[] args) {

        Student david =new Student("David");
        System.out.println(david.fName);
        david.age=23;
        System.out.println(david.age);
        System.out.println(david.schoolName);

        Student marcus=new Student("Marcus", "Hunt", 26);
        System.out.println(marcus.age);

        Student bratt=new Student("Bratt","Jack",19, "Techtorial");

        System.out.println(bratt.fName);
        System.out.println(bratt.schoolName);

    }
}
