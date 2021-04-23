package test.java.java_class.StringBuilderPr;
public class Task {
    public static void replaceMiddle(StringBuilder [] nm){

        for (int i = 0; i <nm.length ; i++) {
            if(nm[i].length()%2==1){
               int middleIndex=nm[i].length()/2; // finds middle index
               nm[i].replace(middleIndex,middleIndex+1,"$");
                System.out.println(nm[i]);
            }
        }
    }
    public static void main(String[] args) {

        StringBuilder [] names = {new StringBuilder("David"), new StringBuilder("Marcus"), new StringBuilder("Kushal"),
                new StringBuilder("Renas"),new StringBuilder("Muammer")};
        //create one method that will accept StringBuilder array and replace middle char with $from every name witch
        // has length is odd number
        replaceMiddle(names);

    }
}
