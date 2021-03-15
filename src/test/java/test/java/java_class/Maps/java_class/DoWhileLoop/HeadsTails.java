package test.java.java_class.DoWhileLoop;
import java.util.Random;
import java.util.Scanner;
public class HeadsTails {
    public static void main(String[] args) {
        // first we will flip the coin and then we will ask user to guess the result
        //if the user guess it correctly we will print you are lucky,
        //otherwise we will print you are loser
        //ask user that do you want to play again? yes/no
       Random random =new Random();
       String answer;
       int  count=0;
        do {
            int number = random.nextInt(2); // generate random number btw 0 and 1
            Scanner input = new Scanner(System.in);

            String flippedCoin = number == 0 ? "Heads" : "Tails";
                System.out.println("the coin is flipping.....");
                System.out.println("Please enter guess:..");
            String userGuess = input.next();

            if (userGuess.equalsIgnoreCase(flippedCoin)) {
                System.out.println("you are lucky. Your guess is correct");
            } else {
                System.out.println("Sorry you are loser. The correct one is " + flippedCoin);

            }
            System.out.println("Do you want to play again?");
            answer = input.next();
        }
            while (answer.equalsIgnoreCase("yes")&&count<5);
                System.out.println("thank you for playing the game!");
    }
}