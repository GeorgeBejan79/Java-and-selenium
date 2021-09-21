package InterviewTasks;
import java.util.Arrays;

public class FToCelsius {
    public static void main(String[] args) {

        int[] FDegrees = {35, 44, 67, 75, 90, 83, 55};

        int size = FDegrees.length;
        int celsius[] = new int[size];
        for (int i = 0; i < size; i++) {
            celsius[i] = ((FDegrees[i]-32)*5)/9;

        }
        System.out.println(Arrays.toString(FDegrees)+ " your conversion is "+Arrays.toString(celsius));
    }
}

