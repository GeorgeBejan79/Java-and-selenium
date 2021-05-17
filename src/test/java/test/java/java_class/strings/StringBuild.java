package test.java.java_class.strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder alpha= new StringBuilder();
        for(char current='a'; current<='z'; current++){
            alpha.append(current);
            System.out.println(alpha);
        }
    }
}













