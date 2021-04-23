package test.java.java_class.Constructor;

public class Result {

    Office office;
    Price pr;
    OfficeTriangle triangle;
    public Result(Office office, Price pr){  //this is a constructor used to iniialise variables
        this.office=office;
        this.pr=pr;
    }
    public Result(OfficeTriangle triangle, Price pr){

        this.triangle=triangle;
        this.pr=pr;
    }
    public double calculatePayment(){
        double area=office.getArea();
        double price =pr.getPrice();
        return area*price;
    }
    public double calculateTrianglePayment(){
        double area=triangle.getArea();
        double price=pr.getPrice();
        return area* price;
    }
}
