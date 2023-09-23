import java.util.*;

class sample2 {
    static void checkage(int age) {
        if (age > 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("you arenot eligible for voting");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        checkage(age);
        scanner.close();
    }
}