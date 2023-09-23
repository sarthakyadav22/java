
import java.util.Scanner;

//SARTHAK22CSU157
public class newcounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            scanner.close();
        }
        swapPairs(arr);
        System.out.println("Array after swapping adjacent elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swapPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
    }
}
