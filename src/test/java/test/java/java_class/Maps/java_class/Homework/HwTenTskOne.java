package test.java.java_class.Homework;
import java.util.Scanner;
public class HwTenTskOne {
    public static void main(String[] args) {
        /*Create the int array with given numbers
    10,4,3,55,32,145,443,234,98,32
    Using scanner user to provide any number from given array, then
    remove the value from array and put 0 instead of that.
    Example:
    Given Number:
    234
    Output:
    10, 4, 3, 55, 32, 145, 443, 0, 98, 32
    */
        Scanner input =new Scanner(System.in);
            System.out.println("Given Number: ");
        int num = input.nextInt();
        int temp = 0;
        int[] numbers = { 10, 4, 3, 55, 32, 145, 443,234,98,32 };
        int[] newNum = new int[numbers.length];
        for (int i = 0; i <numbers.length ; i++) {

            if(numbers[i] == num){
                numbers[i] = temp;

                for (int j = 0; j < numbers.length; j++) {
                    newNum[j]=numbers[i];
                }
            }System.out.print(numbers[i]+" ");
        }
    }
}
