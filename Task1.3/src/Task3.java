import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input a number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i < number2; i++) {
            boolean isPrime = true;
            if (i < 2) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " prime");
        }
        }
    }
}
