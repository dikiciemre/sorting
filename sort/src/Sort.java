import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter ? : ");
        int number_Count = scanner.nextInt();

        int[] numbers = new int[number_Count];

        for (int i = 0; i < number_Count; i++) {
            System.out.print((i + 1) + ". number is : ");
            numbers[i] = scanner.nextInt();
        }

        // Diziyi sırala
        Arrays.sort(numbers);

        System.out.println("Results : (sorted from largest to smallest):");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }
}
