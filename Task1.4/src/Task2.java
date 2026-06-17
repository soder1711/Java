import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.println("Enter integer " + i);
            array[i-1] = Integer.parseInt(scanner.nextLine());
        }
        int maximum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    if (maximum < sum) {
                        maximum = sum;
                    }
                }
            }
        }
        System.out.println(maximum);
    }
}