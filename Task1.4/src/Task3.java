import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(question.nextLine());
        int[] array = new int[size];
        int[] nodupes = new int[size];
        for (int p = 0; p < size; p++) {
            System.out.println("Enter number " + (p + 1) + " : ");
            array[p] = Integer.parseInt(question.nextLine());
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j+1 >= size) {
                    continue;
                }
                if (array[j] > array[j+1]) {
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        int count = 0;
        int newSize = size;
        nodupes[0] = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] == array[i-1]) {
                newSize -= 1;
                continue;
            }
            nodupes[count+1] = array[i];
            count += 1;
        }
        int[] finalList = new int[newSize];
        for (int i = 0; i < newSize; i ++) {
            finalList[i] = nodupes[i];
        }
        System.out.println("Array without duplicates: ");
        for (int num: finalList) {
            System.out.println(num);
        }
    }
}
