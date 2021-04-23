package test.java.java_class.Constructor;

public class Office {
    double length;
    double width;
    double base;
    double height;

    public Office (double width, double length) {
        this.width = width;
        this.length=length;
    }

    public double getArea() {


        return length*width;
    }
}
