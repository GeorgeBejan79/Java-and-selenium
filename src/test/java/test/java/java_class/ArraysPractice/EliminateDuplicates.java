package test.java.java_class.ArraysPractice;
import java.util.Scanner;
public class

        EliminateDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("This program will print the unique numbers that you entered.");
            System.out.println("Duplicate numbers will not be printed.");
        Scanner input = new Scanner (System.in);
        int [] myArray = new int [10];          //creates an array with ten positions

            System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            myArray[i] = input.nextInt();    //user imputes 10 numbers on each position
        }

            System.out. print("The array you entered is "); //print the array
        for(int i = 0; i < 10; i++){
            System.out.print(myArray[i]+" ");
        }

        for (int i = 0; i < 10; i++){
            for(int j = i+1; j<10; j++){
                if(myArray[i]== myArray[j]){     //changes duplicate values to -1
                    myArray[i] = -1;
                }
            }
        }
            System.out.println("The final array is: ");
        for(int i = 0; i < 10; i++){
            if(myArray[i]!= -1){
                System.out.print(myArray[i]+" ");     //prints the array again
            }
        }
    }
}
