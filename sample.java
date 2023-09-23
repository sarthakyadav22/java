import java.util.*;

class sample {
    static int plusmethod(int x, int y) {
        return x + y;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(plusmethod(x, y));
        scanner.close();
    }
}