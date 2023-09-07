import java.util.Scanner;
   class desmod{
      public static void main(String args[]){
        // simple scanner class example ;


  Scanner scanner = new Scanner(System.in);
  
//for printing a String(words).


System.out.println("what is your name?");
String name= scanner.nextLine();



System.out.println("what is your age?");
int age= scanner.nextInt();


System.out.println("my name is"+name);
System.out.println("my age is "+age);



scanner.close();

           }
  }