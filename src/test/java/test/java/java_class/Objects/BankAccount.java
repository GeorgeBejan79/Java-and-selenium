/*package Objects;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String personName;
        String bankName = "Bank of America";
        String accountNumber;
        double balance;
        String username;
        String password;
        boolean isLogined;
        public void display () {
            if (isLogined) {
                System.out.println("Bank: " + bankName);
                System.out.println("Name: " + personName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Please login first.");
            }
        }
        public double deposit ( double depositAmount){
            if (isLogined) {
                balance += depositAmount;
                System.out.println(balance);
            } else {
                System.out.println("Please login first.");
            }
            return balance;
        }
        public double withdraw ( double withdrawAmount){
            if (isLogined) {
                balance -= withdrawAmount;
                System.out.println(balance);
            } else {
                System.out.println("Please login first.");
            }
            return balance;
        }
        // if the param and instance variable has the same name we can use
        // this keyword to call instance variable
        public void login (String username, String password){
            if (this.username.equals(username) && this.password.equals(password)) {
                isLogined = true;
            }
        }
        // this refers the class members (variables and methods are the class members)
        public void signUp (String personName, String accountNumber,double balance, String username, String password){
            this.personName = personName;
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.username = username;
            this.password = password;
        }
        public void getInstructions () {
            System.out.println("Please enter 0 to Sign Up");
            System.out.println("Please enter 1 to Login");
            System.out.println("Please enter 2 to Deposit");
            System.out.println("Please enter 3 to Withdraw");
            System.out.println("Please enter 4 to Display Account Information");
            System.out.println("Please enter 5 to Display the Instructions");
            System.out.println("Please enter 6 to Close Application");
        }
    }  }*/