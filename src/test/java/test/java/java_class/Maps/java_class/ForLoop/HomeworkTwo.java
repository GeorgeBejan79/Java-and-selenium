package test.java.java_class.ForLoop;
import java.util.Scanner;
public class HomeworkTwo {
    public static void main(String[] args) {
        /*Write a Java program to find the perfect numbers within a given number of
    range.
    Test Data :
    Input the starting range or number : 1
    Input the ending range of number : 50
    Expected Output :
    The Perfect numbers within the given range : 6 28
    NOTE: you need to use the nested loop.*/
        Scanner input=new Scanner(System.in);
        int x1, x2;
            System.out.println("please enter first num: ");
        x1=input.nextInt();
            System.out.println("please enter last num: ");
        x2=input.nextInt();
        int sumOfDivisors;

        for(int currentNumber = x1+1; currentNumber <= x2; currentNumber++){ // goes throw all nrs in the given range
            sumOfDivisors=1;

            for(int i = 2; i < currentNumber;i++){ //goes to the numbers excluding last number of the range
                if(currentNumber % i==0){ //checks if last number is divisible by i

                    sumOfDivisors=sumOfDivisors+i;// calculates sum of divisors
                }
            }
            // when we find
            if(sumOfDivisors == currentNumber){ //

                System.out.println("Perfect number is given range- "+currentNumber);
            }
        }
    }
}
