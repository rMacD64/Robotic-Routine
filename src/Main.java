import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        int[] sequence = {1, 2, 3};
        int repeats = 3;

        System.out.println(Arrays.toString(InspectionRoutine.inspectionCount(N, sequence, repeats)));
    }
}
