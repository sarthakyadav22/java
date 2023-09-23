import java.util.*;

class minor {
    // method overloading in java
    static double plusmethoddouble(double r, double t) {
        return r + t;
    }

    static int plusmethodint(int y, int x) {
        return x + y;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double r = scanner.nextDouble();
        double t = scanner.nextDouble();
        System.out.println("the integer sum is:");
        System.out.println(plusmethodint(x,y));
        System.out.println("the floating value sum is:");
        System.out.println(plusmethoddouble(r,t));
        scanner.close();
    }
}