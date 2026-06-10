import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        boolean mastery = false;
        while (!mastery) {
            int score = 0;
            for (int i = 1; i <= 10; i++) {
                int number1 = (int) (Math.random() * 10) + 1;
                int number2 = (int) (Math.random() * 10) + 1;
                System.out.println("answer this question: " + number1 + "*" + number2 + "=?");
                int answer = Integer.parseInt(math.nextLine());
                if (answer == number1 * number2) {
                    System.out.println("Correct!");
                    score += 1;
                    if (score == 10) {
                        mastery = true;
                    }
                } else if (answer != number1 * number2) {
                    System.out.println("Incorrect! The answer is " + number1 * number2);
                }
                System.out.println("Your current score is " + score);
            }
            if (mastery) {
                System.out.println("Congratulation, you have passed the subject");
            }
            if (!mastery) {
                System.out.println("Go back to studying! >:(");
            }
        }
    }
}