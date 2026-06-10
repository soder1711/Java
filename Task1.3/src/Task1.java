import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first coefficient: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the second coefficient: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the third coefficient: ");
        double c = Double.parseDouble(scanner.nextLine());
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b - Math.sqrt(discriminant))/ (2 * a);
        double x2 = (-b + Math.sqrt(discriminant))/ (2 * a);

        if (discriminant >= 0) {
            System.out.printf("%.2f \n%.2f", x1, x2);
        }
        else {
            System.out.println("No real roots");
        }
    }
}
