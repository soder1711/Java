import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        String binary = scanner.nextLine();
        double result = 0;
        for (int i = 0; i < binary.length(); i++) {
            char lastChar = binary.charAt(binary.length() - i - 1);
            double decimal = 0;
            int lastCharNumber = lastChar - '0';
            if (lastCharNumber == 1) {
                decimal = Math.pow(2, i);
            }
            result += decimal;
        }
        System.out.println(result);
    }
}
