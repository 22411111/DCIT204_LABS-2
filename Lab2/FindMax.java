import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Found at Index: " + maxIndex);
        System.out.println("===================");

        scanner.close();
    }
}