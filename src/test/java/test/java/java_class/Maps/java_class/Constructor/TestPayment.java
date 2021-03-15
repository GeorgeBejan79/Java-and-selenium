package test.java.java_class.Constructor;
public class TestPayment {
    public static void main(String[] args) {
        Office office=new Office(10,15); // new objects
        Price price= new Price(11);  // data
        Result result=new Result(office, price);
        System.out.println(result.calculatePayment());

        Office off =new Office(17,21);
        Price price1=new Price(14);
        Result result1=new Result(off, price1);
        System.out.println(result1.calculatePayment());

        // Test this application for another office and building
        //office with is 17 and length is 21
        //price for sq 14 using classes calculate the payment for this new office

        OfficeTriangle triangle =new OfficeTriangle(17,21);
        Price price2=new Price(16);
        Result result2= new Result(triangle,price2);
        System.out.println(result2.calculateTrianglePayment());
    }
}
