package InterviewTasks;

import java.util.Scanner;

public class FizBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" please enter a number between 1 to 100");
        int a = input.nextInt();
        while (a < 100) {
            if (a % (3 * 5) == 0) {
                System.out.println("fuzzbizz");
                break;
            }
            if (a % 3 == 0) {
                System.out.println(" fizz");
            }
            if (a % 5 == 0) {
                System.out.println("buzz");
            }
        }
    }
}