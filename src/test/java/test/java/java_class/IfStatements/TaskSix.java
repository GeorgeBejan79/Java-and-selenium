package test.java.java_class.IfStatements;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("Please enter total number of tables:");
        int numTables = input.nextInt();
        double totalPrice=numTables*110;

        if(numTables>20 ){
            double firstDis = totalPrice*0.18;
                System.out.println("Discount:$ "+firstDis);
            totalPrice-=firstDis;
                System.out.println("Total price:$"+totalPrice);
        }
        else if(numTables>15 ){
            double secondDis = totalPrice*0.15;
                System.out.println("Discount:$ "+secondDis);
            totalPrice-=secondDis;
                System.out.println("Total price:$"+totalPrice);

        }else if(numTables>=10){
            double thirdDis= totalPrice*0.1;
                System.out.println("Discount:$ "+thirdDis);
            totalPrice-=thirdDis;
                System.out.println("Total price:$"+totalPrice);
        }
        else{
            System.out.println("There is no discount");
            System.out.println("total price is: $"+totalPrice);
        }
    }
}
