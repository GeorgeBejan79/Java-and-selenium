package test.java.java_class.Objects;

public class VarArgsPractice {
    public int sum(int...numbers){
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
    //create one names method to provide the names and print all the names witch is given
    //in the parameter with following format
    //1.David
    //2.Marcus
    //3.Ajeesh
    //4.Shashi
    //5.//Sameer
    public void printNames(String ...names ){
        for (int i = 0; i <names.length ; i++) {
            System.out.println((i+1)+". "+names[i]);

        }
    }


    public static void main(String[] args) {
        VarArgsPractice var=new VarArgsPractice();

        int result = var.sum(4,5,6,10,11,23);
        System.out.println(result);
        var.printNames("David","Marcus","Ajeesh","Sameer");

    }
}
