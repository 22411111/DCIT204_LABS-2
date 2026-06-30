import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Brute force nested loop
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n===== PAIR FOUND =====");
                    System.out.println("Index " + i + " and Index " + j);
                    System.out.println("Values: " + arr[i] + " and " + arr[j]);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    System.out.println("=======================");
                    found = true;
                    break outer;
                }
            }
        }

        if (!found) {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}