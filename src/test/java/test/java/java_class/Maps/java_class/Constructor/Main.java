package test.java.java_class.Constructor;
public class Main {
    public static void main(String[] args) {

    Account bobsAccount=new Account ();//("12345", 0.00,"Bob Brown"," bob@email.com" , "773 343 4342");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
    bobsAccount.withdrawal(100.0);
    bobsAccount.deposit(50.0);
    bobsAccount.withdrawal(100.0);
    bobsAccount.deposit(51.0);
    bobsAccount.withdrawal(100.0);
    Account timsAccount=new Account("Tim","tim@email.com","12345");
        System.out.println(timsAccount.getNumber()+" name "+timsAccount.getCustomerName());
        System.out.println("Current balance is "+timsAccount.getBalance());
        timsAccount.withdrawal(100.55);
        System.out.println(timsAccount.getBalance());

    VipPerson  person1=new VipPerson();
        System.out.println(person1.getName());
    VipPerson  person2=new VipPerson("Bob", 25000);
        System.out.println(person2.getName());
    VipPerson  person3=new VipPerson("Tim", 100, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
        System.out.println(person3.getCreditLimit());
    }
}
