package test.java.java_class.Constructor;
public class Account{
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
public Account(){ // empty constructor calling the other constructor
    this("56789", 2.50,"Default name", "Default address","default phone");
    System.out.println("Empty constructor called");
}
public Account(String number, double balance, String customerName, String customerEmailAddress,String customerPhoneNumber){
    System.out.println("Account constructor called");
    this.number=number;
    this.balance=balance;
    this.customerName=customerName;
    this.customerEmailAddress=customerEmailAddress;
    this.customerPhoneNumber=getCustomerPhoneNumber();
}
public void deposit(double depositAmount){
    this.balance+=depositAmount; // adds deposit to the balance
    System.out.println("Deposit of "+depositAmount+" made. New balance is "+this.balance);
}
public void withdrawal (double withdrawalAmount){
    if(this.balance-withdrawalAmount<0){
        System.out.println("Deposit of "+this.balance+" made. New Balance is "+ this.balance);
    }else{
        this.balance-=withdrawalAmount;
        System.out.println("withdrawal of "+withdrawalAmount+ " processed. Remaining balance");
    }
}

    public Account( String customerName, String customerEmail, String customerPhoneNumber){
        this("9999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    /*public Account(String customerName, String customerEmail, String number) {
        this.customerName=customerName;
        this.customerEmail=customerEmail;
        this.number=number;
    }*/


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmailAddress;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmailAddress = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}

