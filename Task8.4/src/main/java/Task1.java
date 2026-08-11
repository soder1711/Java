import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double mean = Arrays.stream(numbers)
                .average()
                .orElse(0);
        System.out.println(Arrays.toString(numbers));
        System.out.println(mean);
    }
}
