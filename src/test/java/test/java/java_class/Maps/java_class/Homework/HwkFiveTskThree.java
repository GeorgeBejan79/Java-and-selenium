package test.java.java_class.Homework;
import java.util.Scanner;
public class HwkFiveTskThree {
    public static void main(String[] args) {
        /*
         Using a scanner enter three different ingredients for the product on the same line. Then ask
the user to enter any int number. Change the first letter of the ingredients starting from the
entered number. (Ingredients should start with different letters. Please read the example
carefully ) Example 1:
Please enter three ingredients with spaces:
Milk Peanuts Butter
Please enter the int number:
5
The output is:
5ilk 6eanuts 7utter
Example 2:
Please enter three ingredients with spaces:
Sugar Cocoa Oil
Please enter the int number:
3
The output is:
3ugar 4ocoa 5il
         */
        Scanner input=new Scanner(System.in);
            System.out.println("Please enter three ingredients with spaces: ");
        String str = input.nextLine();
            System.out.println("Please enter the int number: ");
        int num = input.nextInt();
        int indexNum1 = str.indexOf(" ")+1;
        int thirdIndex = str.indexOf(" ", str.indexOf(" ")+2);
        String str1 = str.substring(1, str.indexOf(" ")); //creates first substring
        String str2 = str.substring(indexNum1+1, thirdIndex); //creates second substring
        String str3 =str.substring(thirdIndex+2,str.length()); //creates third substring
            num++;
            System.out.println((num++)+str1+" "+(num++)+str2+" "+(num++)+str3);

    }
}
