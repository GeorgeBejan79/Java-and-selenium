package InterviewTasks;

import java.util.Scanner;

public class CountNumbersFromOneToProvided {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int num = input.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}