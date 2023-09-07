import java.util.Scanner;
  class floatval{
  public static void main(String args[]){

Scanner scanner = new Scanner(System.in);

System.out.println("enter a floating digit value you want to enter");

double floatvalue = scanner.nextInt();

System.out.println("the float value you have entered is"+floatvalue);

scanner.close();
  
  }
}