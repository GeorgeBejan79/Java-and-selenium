package test.java.java_class.Exeptions;

public class HandleException {
    public static void main(String[] args) {

        String str="12";

try {
    Integer num = Integer.parseInt(str);// this is NumberFormatExeption
    System.out.println(num);
    int number = 5 / 0;// arithmetic exception
}catch (ArithmeticException num){
    System.out.println("there is illegal argument in the input string");
}
catch(NumberFormatException num){
    System.out.println(num.getStackTrace());
    System.out.println("Number format exeption");
    int num1=Integer.parseInt(str.replace("a",""));
}catch(Exception e){
    System.out.println("aaaa");
    }System.out.println("This is test of Exception in java");
}//finally{

    }

//}
