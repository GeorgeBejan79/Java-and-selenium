package test.java.java_class.Constructor;
public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(){ ///first constructor

        this("Default name", (int) 50000.00, "default@email.com");
    }
                                                            //second constructor21h
    public VipPerson(String name, int creditLimit) {       // first two constructors called third constructor
        this(name,creditLimit,"unknown@email.com");

    }
    public VipPerson(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit; //3 rd constructor have save values saved in to the fields
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {

        return creditLimit;
    }

    public String getEmailAddress() {

        return emailAddress;
    }
}
