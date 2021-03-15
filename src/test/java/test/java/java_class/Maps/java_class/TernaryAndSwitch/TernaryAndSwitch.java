package test.java.java_class.TernaryAndSwitch;
import java.util.Scanner;
public class TernaryAndSwitch {
    public static void main(String[] args) {
        //I have 3 students in my database with id 123, 124, 125
        //123-> kushal city name is Chicago
        //124--> Prianka city name is Denver
        //125--> micheal city name is houston
        //Using scanner ask id of the student and if the id is matching then ask student surname and if surname is correct print city name of student
        //what is student id?
        //124
        //What is your name?
        //Priyanka
        //The city name is Denver
        Scanner input=new Scanner(System.in);
            System.out.println("What is your student id? ");
        int id =input.nextInt();
        //System.out.println("what is your name? ");
        //String name =input.next();
            //possible id
        switch(id){
            case 123:
                System.out.println("Please enter your name? ");
                String name =input.next(); //
                if(name.equalsIgnoreCase("kushal")){
                    System.out.println("Chicago");}
                else{
                    System.out.println("Wrong name");
                }
                break;
            case 124:
                System.out.println("Please enter your name? ");
                String name1 =input.next(); //
                if(name1.equalsIgnoreCase("Priyanka")){
                    System.out.println("Denver");}
                else{
                    System.out.println("Wrong name");
                }
                break;
            case 125:
                System.out.println("Please enter your name? ");
                String name2 =input.next(); //
                if(name2.equalsIgnoreCase("michael")){
                    System.out.println("Houston");
                }
                else{
                    System.out.println("Wrong name");
                }
           break;
        }
    }
}
