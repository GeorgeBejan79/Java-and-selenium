package test.java.java_class.Constructor;
public class Phone {

    String name;
    public Phone(String name){
        this.name = name;
    }

    protected void finalize()
    {
        System.out.println(name+" is finalize method");
        System.out.println("Finalized method will be called when we have an object is garbage collected");
    }

    public String toString()
    {
        return "Phone name is "+name;
    }

    public static void main(String[] args) {
        Phone one =new Phone("Samsung");
        Phone two =new Phone("Iphone");
        Phone three = one;
        one = two;
            System.out.println(one);
            System.out.println(one.equals(two));    //true
            System.out.println(two.equals(three));  //false
            System.out.println(one==two);           //true
            System.out.println(two==three);         //false
        three=null;
        System.gc();
    }
}
