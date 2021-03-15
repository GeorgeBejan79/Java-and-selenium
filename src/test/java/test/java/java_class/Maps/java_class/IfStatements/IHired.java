package test.java.java_class.IfStatements;

import java.util.Scanner;

public class IHired {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

            System.out.println("do you know java? ");
        String java=input.next();

        if(java.equals("yes")){
            System.out.println("Do you know selenium");
            String selenium=input.next();
            if(selenium.equals("yes")){
                System.out.println("do you know Api testing");
                String api=input.next();
                if(api.equals("yes")){
                    System.out.println("do you know sql");
                    String sql=input.next();
                    if(sql.equals("yes")){
                        System.out.println("you are hired");
                    }else{
                        System.out.println("we require sql");
                    }
                } else{
                    System.out.println("we require api testing");
                }
            }
            else{
                System.out.println("we require selenium");
            }
        }else{
            System.out.println("We require java ");
        }
    }
}
