package test.java.java_class.Primitives;

public class MultiplyNumber {

    public static void main(String[]args){
        int number =57884;
        //if you want to get the digits from your number you need to finde reminder with 10 and divide with 10
        //Task: find multiplication of all digits

        int first=number%10;  //4
        number=number/10;
        int second=number%10;  //8
        number=number/10;
        int third = number%10;  //8
        number=number/10;
        int forth =  number%10;  //7
        number=number/10;
        int fifth= number%10;  //5

        int multiplier = first*second*third*forth*fifth;

        System.out.println(multiplier);



    }
}
