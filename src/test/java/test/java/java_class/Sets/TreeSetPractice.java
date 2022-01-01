package test.java.java_class.Sets;

import java.util.TreeSet;

public class TreeSetPractice
{
    public static void main(String[] args)
    {
        //NOTE: Left side (Variable type object) will decide witch method to call
        //Right side of the object will decide Witch method to create in java memory
        TreeSet<String> soccerTeams = new TreeSet<>();
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
        //it will get the first element and remove the first element from Treeset
        //it will get the last element and remove the last element from Treeset
        System.out.println(soccerTeams.pollFirst());
        System.out.println(soccerTeams.pollLast());
        System.out.println(soccerTeams);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(9);
        numbers.add(57);
        numbers.add(234);
        numbers.add(34);
        System.out.println(numbers);
        System.out.println(numbers.last());
        System.out.println(numbers.first());
        System.out.println(numbers.pollLast());
        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

        TreeSet<Integer> numbers1= new TreeSet<>();
        for (int i = 10; i <21; i+=2 )
        {
            numbers1.add(i);
        }
        System.out.println(numbers1);
    }
}
