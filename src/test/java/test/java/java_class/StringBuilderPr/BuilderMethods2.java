package test.java.java_class.StringBuilderPr;

public class BuilderMethods2 {
    public static void main(String[] args)
    {

        StringBuilder test1 = new StringBuilder("2021").append(" new year");
        StringBuilder test2 = test1.append(" started");
        test2.append("today");
        System.out.println(test1);
        System.out.println(test2);

        StringBuilder builder = new StringBuilder("Toyota");
        // System.out.println(builder.charAt(20)); IOOB exeption
        System.out.println(builder.indexOf("o"));
        System.out.println(builder.indexOf("o", 2));
        System.out.println(builder.indexOf("ta"));// we don't have k it will return -1
        System.out.println(builder.indexOf("k"));
        System.out.println(builder.length());

        System.out.println(builder.substring(3));
        System.out.println(builder);
        System.out.println(builder.substring(2, 5));

        System.out.println(builder);// Toyota

        builder.insert(2, "-"); // it is inserting - at index 2
        System.out.println(builder);
        builder.insert(5, ".-");
        System.out.println(builder);

        StringBuilder bl = new StringBuilder();
        bl.append("preparation");
        bl.insert(0, "$");
        bl.insert(11, "$");
        bl.insert(3, "-");

        System.out.println(bl);
        bl.delete(bl.length() - 2, bl.length());
        System.out.println(bl);

        bl.deleteCharAt(bl.indexOf("-")); //find - and delete
        System.out.println(bl);
        //TASK: create one method that will accept string as a parameter and will remove all the "-" and print it
        //Example: pre-pa-ra-ti-on-->
        deleteLetter("p--on");
    }

    public static void deleteLetter(String str) {
        StringBuilder bl = new StringBuilder();

        for (int i = 0; i < bl.length(); i++) {
            if (bl.charAt(i) == '-') ;
            {
                bl.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(bl);
    }
}
