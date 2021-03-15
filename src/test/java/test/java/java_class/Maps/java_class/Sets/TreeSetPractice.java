package test.java.java_class.Sets;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        //NOTE: Left side (Variable type object) will decide wich method to call
        //Right side of the object will decide mich method to create in java memory
        TreeSet<String> soccerTeams=new TreeSet<>();
        soccerTeams.add("New York City");
        soccerTeams.add("Galaxy");
        soccerTeams.add("Chicago fire");
        soccerTeams.add("Inter Miami");
        soccerTeams.add("Atlanta United");


        System.out.println(soccerTeams);// prints elem in ascending order
        System.out.println(soccerTeams.contains("Galaxy"));
        System.out.println(soccerTeams.first());
        System.out.println(soccerTeams.last()); //prints last element
        System.out.println(soccerTeams);
        //it will get the first elemen and remove the first element from Treeset
        //it will get the last elemen and remove the last element from Treeset
        System.out.println(soccerTeams.pollFirst());
        System.out.println(soccerTeams.pollLast());
        System.out.println(soccerTeams);
    }
}
