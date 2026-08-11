import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 5, 8, 20, 15, 3, 12));
        System.out.println("Original list: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("After filtering out evens: " + numbers);
        numbers.replaceAll(n -> n * 2);
        System.out.println("After doubling the odds: " + numbers);
        int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum of the numbers: " + sum[0]);
    }
}
