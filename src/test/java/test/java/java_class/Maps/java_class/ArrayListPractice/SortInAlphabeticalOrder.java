/*package ArrayListPractice;
import java.util.*;
public class SortInAlphabeticalOrder {
    //private static Object ArrayList;

    public static void main(String[] args) {
        /*-------------------------------------------------------------------solution 1
        ArrayList<String> firstNames = new ArrayList<String>();// firstNames
        firstNames.add("Ramis ");
        firstNames.add("Ari ");
        firstNames.add("Ela ");
        firstNames.add("Chopa ");

        ArrayList<String> lastNames = new ArrayList<String>();// lastNames
        lastNames.add("Lopez");
        lastNames.add("Whatever");
        lastNames.add("Grande");
        lastNames.add("Gomez");

        ArrayList<String> fullNames = new ArrayList<String>();

        for (int i = 0; i <firstNames.size() ; i++) {
            fullNames.add(firstNames.get(i) + "" + lastNames.get(i));

        }
        Collections.sort(fullNames);
        firstNames.clear();// clear the arrays
        lastNames.clear();

        for (int i = 0; i <fullNames.size() ; i++) {

            String[] names =fullNames.get(i).split(" ");

            firstNames.add(names[0]); // repopulate the arrays
            lastNames.add(names[1]);
        }
        System.out.println(firstNames);
        System.out.println(lastNames);*/
        //-----------------------------------------------------------------solution 2
        /*List<String> firstNames = new ArrayList<String>();// firstNames
        firstNames.add("Ramis ");
        firstNames.add("Ari ");
        firstNames.add("Ela ");
        firstNames.add("Chopa ");

        List<String> lastNames = new ArrayList<String>();// lastNames
        lastNames.add("Lopez");
        lastNames.add("Whatever");
        lastNames.add("Grande");
        lastNames.add("Gomez");

        List<String> firstNamesSorted = new ArrayList<>(firstNames);

        Collections.sort(firstNamesSorted); // Ari Chopa Ela Ramis

        // we are comparing firstNames with firstNamesCopy

        for(int i = 0; i < firstNamesSorted.size(); i++){   // sorted ArrayList - currentIndex
            for(int j = 0; j < firstNames.size(); i++)      // unsorted ArrayList - originIndex
                if(firstNamesSorted.get(i).equals(firstNames.get(j))){
                    // Ari: currentIndex = 0; originIndex = 1; lastName = Whatever
                    // Chopa: currentIndex = 1; originIndex = 3; lastName = Gomez
                    //String originValue = lastNames.set(currentIndex, lastNames.get(originIndex));
                    //lastNames.set(originIndex, originValue);
                    // Whatever Whatever Grande Gomez

                    // ToDo develop this approach and add code here
                    // ....
                }
        }

        // .... some code here as well
    }
}*/