package InterviewTasks;

public class Regex {
    public static void main(String[] args) {
        String given = "234123498iojdfklsngmadfngmkg...x,";

        //removes all the characters except numbers
        String replaced = given.replaceAll("[^0-9]", "");
        System.out.println(replaced);

        //converts string to integer
        int number = Integer.parseInt(replaced);

        int sum = 0; //declare variable sum

        while (number > 0)  //loops throw the number
        {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}


