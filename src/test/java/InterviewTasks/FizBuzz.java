package InterviewTasks;

public class FizBuzz {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" please enter a number between 1 to 100");
//        int a = input.nextInt();
//        while (a <= 100) {
//            if (a % (3 * 5) == 0) {
//                System.out.println("fuzzbizz");
//                break;
//            }
//            if (a % 3 == 0) {
//                System.out.println(" fizz");
//            }
//            if (a % 5 == 0) {
//                System.out.println("buzz");
//            }
//            a++;
//    }
        for (int i = 1; i < 100; i++) {
            if (i % (3 * 5) == 0) {
                System.out.println("fizzbuzz");

            } else if (i % 3 == 0) {
                System.out.println("fizz");

            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else
                System.out.println(i);
        }
//            String answer = (i % 15 == 0) ? "fizbuzz" : (i % 5 == 0) ? "Buzz" : (i % 3 == 0) ? "FIzz" : "" + i;
//            System.out.println(answer);
        }
    }
