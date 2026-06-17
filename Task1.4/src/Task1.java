import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many names do you want to generate: ");
        int count = Integer.parseInt(scanner.nextLine());
        String[] firstNames = {"James", "Emma", "Maria", "Michael", "Olivia"};
        String[] lastNames = {"Smith", "Doe", "Garcia", "Johnson", "Williams"};
        for (int i = 0; i < count; i++) {
            int numberGenerator1 = (int) (Math.random() * 5);
            int numberGenerator2 = (int) (Math.random() * 5);
            System.out.println(firstNames[numberGenerator1] + " " + lastNames[numberGenerator2]);
        }
    }
}
