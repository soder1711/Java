import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the length of a side of a right triangle: ");
        double length1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Give me the length of a side of a right triangle: ");
        double length2 = Double.parseDouble(scanner.nextLine());

        double hypotenuse = Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
        System.out.println("The length of a hypotenuse is " + hypotenuse);
    }
}
