import java.util.Scanner;
   public class leviathan{
      public static void main(String args[]){

Scanner scanner = new Scanner(System.in);
  

System.out.println("enter your name");
String name = scanner.nextLine();

System.out.println("enter your age");
int age = scanner.nextInt();

System.out.println("are you a TOP G?");
String g= scanner.nextLine();

int currentyear=2023;
int birthyear= currentyear-age;


System.out.println("Hello" +name+ "!");
System.out.println("you were born in"+birthyear);


scanner.close();

 }
}