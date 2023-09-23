
import java.util.Arrays;
import java.util.Scanner;

public class mediancalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        double median = calculateMedian(arr);
        System.out.println("The median of the array is: " + median);
        scanner.close();
    }

    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 == 0) {
            int middle1 = arr[length / 2 - 1];
            int middle2 = arr[length / 2];
            return (double) (middle1 + middle2) / 2;
        } else {
            return arr[length / 2];
        }
    }
}
