package test.java.java_class.Homework;
import java.util.Arrays;
import java.util.Scanner;
public class HwTenTskTwo {
    public static void main(String[] args) {
        /*Using Scanner ask user to provide any string value and index number
    from the array.
    Using for loop update value from array.
    Example:
    [ Liam, Emma, Noah, Olivia, William ]
    Please enter String:
    Lucas
    Please enter index number:
    3
    Output:
    [ Liam, Emma, Noah, Lucas, William ]*/
        Scanner input = new Scanner(System.in);
        String[] names = {"Liam", "Emma", "Noah", "Lucas", "William"};

        String[] newName = new String[5];
            System.out.println(" Please enter String: ");
        String str = input.nextLine();
            System.out.println("Please enter index number: ");
        int num = input.nextInt();

        for (int i = 0; i < names.length; i++) {

            if(i!=num){
                newName[i]=names[i];
            }
            else{
                newName[i] = str;
            }
        }
        System.out.println(Arrays.toString(newName));
        }
    }
