import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();
        
        System.out.println("Enter your birth month (1-12):");
        int birthMonth = scanner.nextInt();
        
        System.out.println("Enter your birth day:");
        int birthDay = scanner.nextInt();
        
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        
        Period age = Period.between(birthDate, currentDate);
        
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.");
        
        scanner.close();
    }
}
