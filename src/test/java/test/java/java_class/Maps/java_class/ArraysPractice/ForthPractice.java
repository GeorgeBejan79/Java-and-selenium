package test.java.java_class.ArraysPractice;

public class ForthPractice {
    public static void main(String[] args) {
        char[]caracters={'a', 'r', '4', '2', 'w', '8'};
        for(int i=0; i <caracters.length; i++){
            // 48, 49...57  from ascii table
            //if(caracters[i]>48 && caracters[i]<=57){  // check in ascii table if char is digits btw 48 and 57
             if(!Character.isDigit(caracters[i])&&!Character.isDigit(caracters[i])); {
                System.out.println(caracters[i]);
             }
        }
    }
}
