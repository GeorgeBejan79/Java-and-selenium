package test.java.java_class.Homework;
import java.util.Scanner;
public class HwEightTskFive {
    public static void main(String[] args) {
        /*The user using a scanner enters the current speed and target
    speed . In every 1-sec car's speed will increase 10mil. Please
    find the total number of sec to reach your target speed using a
    while loop.
    Example:
    CurrentSpeed: 6
    Target Speed: 20
    Output: You need 2 sec to reach target speed.

     int num=20;

        while(num<=30){
            if(num%2==0) {
                System.out.println(num);

            }
            num++;

    */
        Scanner input=new Scanner(System.in);
            System.out.println("Current speed: ");
        int speed =input.nextInt();

            System.out.println("Target speed: ");
        int targetSpeed = input.nextInt();
        int increment =0;
        int difference=targetSpeed-speed;

        //difference!=0; && reminder

        while(speed <= targetSpeed){



            System.out.println();
        }

    }
}
