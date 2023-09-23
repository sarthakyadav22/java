
import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count pairs of two 6's next to each other
        int sixPairs = countSixPairs(arr);

        // Count instances where the second element is 7
        int secondElementIsSeven = countSecondElementIsSeven(arr);

        System.out.println("Number of pairs of two 6's next to each other: " + sixPairs);
        System.out.println("Number of instances where the second element is 7: " + secondElementIsSeven);
        scanner.close();
    }

    public static int countSixPairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 6 && arr[i + 1] == 6) {
                count++;
            }
        }
        return count;
    }

    public static int countSecondElementIsSeven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == 7) {
                count++;
            }
        }
        return count;
    }
}
