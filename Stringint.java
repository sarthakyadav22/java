import java.util.Scanner;
  class Stringint{
  public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
 

System.out.println("enter an integer value and a string value");
int inteval = scanner.nextInt();

String strval = scanner.nextLine();

System.out.println("integer value: " +inteval);
System.out.println("String value: "+strval);

scanner.close(); 

   }
}


 