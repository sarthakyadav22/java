import java.util.Scanner;
   class lebron{
     public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);

System.out.println("enter a number");
int number = scanner.nextInt();
if (number>10){
System.out.println("the number is less than 10");
}else{
System.out.println("the number is greater than 10");
}
scanner.close();
}
}
