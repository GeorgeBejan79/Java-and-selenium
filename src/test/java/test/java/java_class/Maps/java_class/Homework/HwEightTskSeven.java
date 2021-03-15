package test.java.java_class.Homework;

import java.util.Scanner;

public class HwEightTskSeven {
    public static void main(String[] args) {
        /*Using a scanner ask the user to input username and password. Create
    the two variables for the expected username and password. if user input
    is not matching with the expected username and password ask the user
    again until they are correct. (Optional: if you want to make it a little
    complicated. You can allow the user only three times to enter the wrong
    username or password. if it is more than 3 times you can print “your
    account is on hold now. Try after 5 min”) */
        Scanner input= new Scanner(System.in);
            System.out.println("Please insert your username: ");
        String usr = input.next();
        String userName="Techtorial";
        String password="Love_Java_2";

        int count = 1;
        if(usr.equals(userName)) {
                System.out.println("Please insert your password");
            String psw = input.next();

            if(psw.equals(password)){
                System.out.println("You are in");

            }else{
                    System.out.println("Please reinsert your password");
                psw = input.next();
                count++;

                if(count<=3){
                        System.out.println("Please reinsert your password: ");
                    usr = input.next();
                    count++;

                }else{
                    System.out.println("account is on hold now. Try after 5 min");
                }
            }
        }else {
                System.out.println("Please reinsert your username: ");
            usr = input.next();
            count++;
                System.out.println(count);

            if(count<=3){
                System.out.println("Please reinsert your username: ");
                usr = input.next();
                count++;

            }else{
                System.out.println("Account is on hold now. Try after 5 min");
            }
        }
    }
}
