package test.java.java_class.IfStatements;
import java.util.Scanner;
public class BuyPhone {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
            System.out.println("Witch brand phone you want to buy? ");
        String brand =input.nextLine();
        if(brand.equals("Apple")){
            System.out.println("The Iphone models are Iphone 10, Iphone 11, Iphone12");
            String model=input.nextLine();
                if(model.equals("Iphone 10")){
                    System.out.println("Please enter $800");
                    int price =input.nextInt();
                        if(price==800){
                            System.out.println("Here is your phone");
                        }else{
                            System.out.println("Sorry try again");
                        }
                }else if(model.equals("Iphone 11")){
                    System.out.println("Please enter $900");
                    int price =input.nextInt();
                    if(price == 900){
                        System.out.println("Here is your phone");
                    }else{
                        System.out.println("Sorry try again");
                    }

                }else{
                    System.out.println("Please enter 850");
                    int price =input.nextInt();
                        if(price==850){
                            System.out.println("Here is your phone");
                        }else{
                            System.out.println("Sorry try again");
                        }
                }
        }else if(brand.equalsIgnoreCase("Samsung")){
            System.out.println("The Samsung models are Note 8, Note 9, Note 10");
            String model=input.nextLine();
            if(model.equals("Note 8")){
                System.out.println("Please enter $750");
                int price=input.nextInt();
                if(price==750){
                    System.out.println("Here is your phone");
                }else{
                    System.out.println("Sorry try again");
                }
            }else if(model.equalsIgnoreCase("Note 9")){
                System.out.println("Please enter $850");
                int price=input.nextInt();
                if(price==850){

                    System.out.println("Here is your phone");
                }else{
                    System.out.println("Sorry try again");
                }
            }else{
                System.out.println("Please enter 950");
                int price =input.nextInt();
                if(price==950){
                    System.out.println("Here is your phone");
                }else{
                    System.out.println("Sorry try again");
                }
            }
        }else{
            System.out.println("The Google models are Pixel 3, Pixel 4, Pixel 5");
            String model=input.nextLine();
            if(model.equalsIgnoreCase("Pixel 3")){
                System.out.println("Please enter 450");
                double price=input.nextDouble();
                    if(price==450){
                        System.out.println("Here is your phone");
                    }else{
                        System.out.println("Sorry try again");
                    }
            }else if(model.equalsIgnoreCase("Pixel 4")){
                System.out.println("Please enter 550");
                double price=input.nextDouble();
                if(price==550){
                    System.out.println("Here is your phone");
                }else{
                    System.out.println("Sorry try again");
                }

            }else{
                System.out.println("Please enter 650");
                double price=input.nextDouble();
                if(price == 650){
                    System.out.println("Here is your phone");
                }else{
                    System.out.println("Sorry try again");
                }
            }
        }
    }
}
