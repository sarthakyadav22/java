import java.util.Scanner;
public class sicalci{
   public static void main(String args[]){
       Scanner scanner =new Scanner (System.in);

System.out.println("enter your principal amount");
double principal = scanner.nextDouble();
        
      System.out.println("enter your rate for interest");
      double rate =scanner.nextDouble();
 

   System.out.println("enter the tenure for the loan");
 double time = scanner.nextDouble();

// calculating the simle interest here 
double simpleinterest = ( principal*rate*time)/100 ;


// displaying the simple interst here 

System.out.println("the simple interest is " +simpleinterest);

scanner.close();

        }
}