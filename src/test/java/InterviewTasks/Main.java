package InterviewTasks;

import java.util.Scanner;

class Main {
    public static String StringChallenge(String str) {
        int digitCount = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {

                digitCount++;
            } else {
                char count = (char) digitCount;

                if (digitCount > 1 && count == str.charAt(i)) {
                    return "true";
                }
                digitCount = 1;
            }
        }
        return "false";
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }
}