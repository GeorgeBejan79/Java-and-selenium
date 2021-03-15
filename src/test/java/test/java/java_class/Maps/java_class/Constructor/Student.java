package test.java.java_class.Constructor;
public class Student {

    String fName;
    String lName;
    int age;
    String schoolName="Depaul";
     public Student(String fName, String lName, int age){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
     }
     public Student(String fName, String lName, int age, String schoolName){
         this.fName=fName;
         this.lName=lName;
         this.age=age;
         this.schoolName=schoolName;
     }
    public Student(String fName){
        this.fName=fName;
    }
    //I want to create one method will give value to the fName
    public void setfName(String newName){

        fName=newName;
    }
    public static void main(String[] args) {
        Student student=new Student("Trump");
        System.out.println(student.fName);//--> Trump
        student.fName="David";   //give value for fName
        System.out.println(student.fName);//-->David
        student.setfName("Techtorial");
        System.out.println(student.fName);// -->Techtorial
        System.out.println(student.schoolName);
    }

}
