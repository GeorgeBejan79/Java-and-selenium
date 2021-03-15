package test.java.java_class.ForLoop;

public class FooBar {
    public static void main(String[] args) {

        /* give the number, if the number is divisible by 3 then print out footext to the screen, if it is divisible by r then print out
        bar, if the number is divisible by both then print FooBar
        * 1 Expect the number
            2.check if the number si divisible by 5 _>bar
        * 3check if the number si divisible by 3 _>Foo
        check if the number si divisible by 5 and 3 _>FooBar
        print out the result
        * */
       /* final int a = 0;//
        int number =...;
        if(number % 3 == 0 && number % 5 == 0){// this one should be the first condition
            System.out.println("Foobar");            ---------------------------
                                                    //this one is for interview
        } if(number % 3 == 0){                      ---------------------------------
            System.out.println("Foo");

        }if(number % 5==0){

            System.out.println("Bar");
        }*/
        String str = "Techtorial";
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}