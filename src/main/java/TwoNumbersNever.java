import java.util.Scanner;

public class TwoNumbersNever {
    public static void main(String[] args) {
        // A single boolean value true if n and m never occur next to each other; otherwise, it is false
        boolean didOccur = false;
        // Create scanner
        Scanner scanner = new Scanner(System.in);
        // Read the size of the array
        int arraySize = scanner.nextInt();
        // Initialize the array with the array size
        int[] array = new int[arraySize];
        // Read the array elements from user
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        // Read two integers n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
