//example to print the value entered by the user

import java.util.Scanner;
  class user{
public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
  

System.out.println("enter the word value you want to get printed");
String word = scanner.nextLine();

System.out.println("enter the numeral value you want to get printed");
int numeral = scanner.nextInt();

System.out.println("you entered this value"+word);
System.out.println("you entered this value"+numeral);

scanner.close();

    }
}