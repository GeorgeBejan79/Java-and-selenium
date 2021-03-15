package test.java.java_class.Primitives;
public class ReminderPractice {
    public static void main(String[]args){

        double num2=11.46%10;
        int number = 2346;
                                    //Find sum of all digits from number;       (interview question)
        int first=number%10; //6

        number=number/10; //234
        int second=number%10; //   234%10=4;

        number=number/10; // 23

        int third = number%10; //2

        number=number/10;

        int forth =  number%10;

        int sum = first+second+third+forth;

            System.out.println(sum);

    }
}
