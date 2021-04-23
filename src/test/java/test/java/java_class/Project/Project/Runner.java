package test.java.java_class.Project.Project;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            option = scanner.next();
            makeAChoice(option);
        } while (option.equals("0"));
    }
           private static  void makeAChoice(String choice){
        switch (choice){
            case "0":
            System.out.println("To print grocery menu");
            break;
            case "1":
                System.out.println("To Print choice option");
            case "2":
                System.out.println("To Print  the list of grocery items");
            case "3":
                System.out.println("To add an item to the list");
            case "4":
                System.out.println("To modify an item in the list");
            case "5":
                System.out.println("To remove an item from the list");
            case "6":
                System.out.println("To search for an item in the list");
            case "7":
                System.out.println("To check out the cart");
            case "8":
                System.out.println("To payment");
            case "9":
                System.out.println("To quit  the application");
        }
    }
   public void AddItem(){
     
   }
        }
