package test.java.java_class.ForLoop;

public class ForBar {
    public static void main(String[] args) {
    /*Write a program in Java to find the sum of the series 1 +11 + 111 +
    1111 + .. n terms.
    Test Data :
    Input the number of terms : 5
    Expected Output :
    1 + 11 + 111 + 1111 + 11111
    The Sum is : 12345*/
    int number=3;
    int previousNum=1;
    int sum=0;
    String text="";
    for(int i=1; i<=number; i++){
        text=text+previousNum;
        System.out.println(text);       //solution using strings
        if(i<number)
            System.out.println(" + ");
        sum =sum+Integer.parseInt(text);
    }
        System.out.println("\nSum is: "+sum);
    //int i=1;
    //while( condition){
        // some code
        //i++;
        /*int i=1;
        while(i<=number) {
            System.out.print(previousNum);
            if (i < number)
                System.out.print("+");
            previousNum = previousNum * 10 + 1; //11
            i++;
            sum+=previousNum;*/
        }
    /*for(int i=1;i<=number;i++){//for(initialisation; condition; incrementation)
        System.out.print(previousNum);
            if(i<number)
        System.out.println("+");
        previousNum=previousNum*10+1; //11  */
        //System.out.println("\nSum is: "+sum);
    }


