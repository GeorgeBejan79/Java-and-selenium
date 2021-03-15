package test.java.java_class.Primitives;

public class TruthTable {
    public static void main(String[] args) {
        /* AND --> &&
        // OR --> //

        // gpa = 3.6--> gpa should be more than 3.6
        // gre should be bigger than 560 */
        double gpa =3.5;
        int greScore =570;
        boolean result =gpa>3.6 || greScore>560;

            System.out.println("Can I register to the University? "+result);

        /*to be abble to buy a house I need to have $300000
        or credit score more than equals to 680*/
        int housePrice =300_000;
        int creditScore =680;
        int myMoney =380;
        int myCreditScore =670;


        boolean _result = myMoney >= housePrice || myCreditScore >= myCreditScore;

            System.out.println("Can I buy the house? " + _result);
    }
}
