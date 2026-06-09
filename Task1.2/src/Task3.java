import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write in the weight: ");
        int weight = Integer.parseInt(scanner.nextLine());
        double weightLeiviska = weight / 13.28 / 32 / 20;
        double weightNaula = (weightLeiviska - (int)weightLeiviska) * 20;
        double weightLuoti = (weightNaula - (int)weightNaula) * 32;
        System.out.printf("%d grams is %d leiviska, %d naula, and %.2f luoti.",
                weight,
                (int)weightLeiviska,
                (int)weightNaula,
                weightLuoti);
    }
}
