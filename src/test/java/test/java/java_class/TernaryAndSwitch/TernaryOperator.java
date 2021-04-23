package test.java.java_class.TernaryAndSwitch;
public class TernaryOperator {
    public static void main(String[] args) {
        int num = 10;
        int k = 5;
        int r = 9;
        // booleanCondition? Value1 : value 2;

        num=k<=r? num++ : --num;

        System.out.println(num);
        //-----------------------------------
        //Exemple 1
        String test = "Techtorial";
        String result = test.startsWith("Te")? "TE" : "not found";

        System.out.println(result);
        //Exemple 2--------------------------------
        if(test.startsWith("Te")){
            System.out.println("TE");
        }else{
            System.out.println("not found"); // does the same like in example 1

            //int finalResult=6>4 ? 6: "six"; -->compile time error
            //note if you are assigning the result to one date type both
            // sides of the column must be the same data type
            System.out.println(6>4 ? 6: "six");
            if(6>4){
                System.out.println(6);
                //int nu=6;
            }else{
                System.out.println("six");
                //int nu="six";
            }
        }
        int x=11;
        int y =13;
        int testResult =x<=y ? x++ + --y : ++x - x--;
            System.out.println(x);      //12
            System.out.println(y);      //12
            System.out.println(testResult); //23
    }
}
