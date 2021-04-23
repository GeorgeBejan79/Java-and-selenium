package test.java.java_class.Homework;

public class HwSevenTskSeven {
    public static void main(String[] args) {
        /*In my ventra card, I have an $36. Every usage of the ventra card
        is costing $3. Using while loop print how many times I have used
        the ventra card.
                Example:
        Usage 1
        Usage 2
        Usage 3
                ..
        Usage 12
        */
        int credit = 36;
        int count = 1;
        while (credit <= 36 && credit > 0){

            System.out.println("Usage "+count);
            count++;
            credit-=3;
        }
    }
}
