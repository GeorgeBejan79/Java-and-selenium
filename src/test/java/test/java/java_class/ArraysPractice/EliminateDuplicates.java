package test.java.java_class.ArraysPractice;
import java.util.Arrays;
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

    public static class ArrayPracticeOne {
        public static void main(String[] args) {
            String reverse="";
            int[] arr={1,2,3,4,5,6,7};
            //-------------------------------------------------------------------------
            for ( int i = arr.length-1, k=0; k<arr.length/2;  i--, k++) {
                int temp = arr[k];
                arr[k] = arr[i];            // reverse the array
                reverse +=arr[i];
                arr[i]=temp;
            }
            //System.out.println(Arrays.toString(arr));
            //----------------------------------------------------------------------------
            /*for (int i = 0; i < arr.length/2; i++) {
                int temp=arr[i];
                arr[i]=arr[arr.length-i-1];  //reverse it back
                arr[arr.length-1]=temp;
            }*/
            System.out.println(Arrays.toString(arr));
        }
    }
}
