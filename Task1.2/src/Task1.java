import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Give the temperature in Fahrenheit:");
        double temperatureFahrenheit = Double.parseDouble(temp.nextLine());
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f", temperatureCelsius);
    }
}
