package test.java.java_class.Objects;
public class Math {

    public void square(int number) {
        System.out.println("Square of the value is " + number * number);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public double rectangleArea(double length, double width) {
        double result = length * width;
        return result;
    }

    public int sum(int[] numbers) {
        //numbers={3,4,5,6,7,7}
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int sumNum(int... numbers) {
        Math math = new Math();
        int result = math.sum(numbers);
        return result;
    }
}