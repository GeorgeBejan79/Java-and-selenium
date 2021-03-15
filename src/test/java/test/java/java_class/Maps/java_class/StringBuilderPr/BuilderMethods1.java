package test.java.java_class.StringBuilderPr;

public class BuilderMethods1 {
    public static void main(String[] args) {
        StringBuilder succes =new StringBuilder().append("Techtorial ").append("2021");
        succes.append(" best year ever. ").append(19).append(true);
        System.out.println(succes);
        String str ="";
        str.concat("Techtorial").concat(" 2021");
        str.concat(" best year ever");
        System.out.println(str);
        StringBuilder words= new StringBuilder().append("I love ").append("Java ");
        words.append("It is the best language.");
        StringBuilder truth = words.append(" It is hard");
        truth.append("Today is Sunday");

        System.out.println(words);
        System.out.println(truth);
        String test ="Techtorial";
        String result=test.concat("Academy");
        System.out.println(test);
        System.out.println(result);

    }
}
