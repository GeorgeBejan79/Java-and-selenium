package test.java.java_class.Primitives;

public class ReminderPractice2 {

    public static void main(String[] args) {

        // sout for println
        //main for main method or psvm
        short phonePrice=687;
        // if you pay in 15 month, how much you are going to pay each month
        int montlyPayment =phonePrice/15;


        System.out.println(montlyPayment);

        //  how we can find out last month payment if I pay 100$ each month;
        int lastMonthPayment=phonePrice%100;
        // 100+100+100+100+100+100+87
        System.out.println(lastMonthPayment);
    }
}
