package test.java.java_class.OOP.Polymorphism;

public class Client {
    public static void main(String[] args) {
        Bank bank= new Bank();
        bank.deposit();
        bank.loan();
        bank.openBranch();

        Branch branch=new Bank();
        branch.hire();
        //since hire is overridden in bank
        // class it will be called from there
        //since openbranch() is available under the bank I can t call using branch class
        branch.deposit();
        branch.displayBalance();
        ATM atm =new Bank();
        atm.displayBalance();
        ((Branch)atm).hire();
        //WE can down cast the reference explicitly to get hire() method from child class.

        ATM atm1 = new ATM();
        Branch branch1=(Bank)atm1;
        // once we cast directly from ATM to Bank
        //it will give the classCastExeption since
        // it has no direct  relation with bank.
        //branch1.loan();
        //Bank bank1=(Bank)new Branch();
        //bank1.openBranch();
        Bank bank1=new Bank();
        //Branch branch1=bank1;
        branch1.loan();

        ATM atm2=new Branch();
        atm2.displayBalance();
        ((Branch) atm2).loan();
        Branch branch2=new Bank();
        //Broker broker = new Bank();
        //btw siblings is no polymorphic relationship
    }}
