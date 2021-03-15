package test.java.java_class.Blocks;

public class Blocks {
static{
    System.out.println("Static block"); // you can put the budget here
    }
    {
        System.out.println("Instance block");// you can put the department here
    }
    public Blocks(){
        System.out.println("No blocks");
    }

    public static void main(String[] args) {
        Blocks blocks1=new Blocks();
        Blocks blocks2=new Blocks();
        Blocks blocks3=new Blocks();

    }
}
