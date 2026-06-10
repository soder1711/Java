import java.util.Scanner;
public class Classwork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            if (number > 0) {
                System.out.println("The number is positive.");
            }
            else if (number < 0) {
                System.out.println("The number is not positive.");
            }
            System.out.println("Give another number:");
            number = Integer.parseInt(scanner.nextLine());
        }
    }
}
