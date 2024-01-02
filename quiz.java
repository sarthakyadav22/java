package projects;

import java.util.*;

public class quiz {
 public static void main(String args[]) {
	  
	 Scanner sc= new Scanner(System.in);
	 
	 //now we want to store the responses of the user  and the best way to store the response is
	 //using a String 
	 String [] answer = {"a","d","c","a" };
//these are the answers from where the program would verify the correct answers of the user
	 String [] response = {" "," "," ", " "};
	
	 
	System.out.println("What is the capital of india?");
	System.out.println("a)ontario");
	System.out.println("b)delhi");
	System.out.println("c)alberta");
	System.out.println("d)toronto");
	
	System.out.println("Games of thrones is associated to which book?");
	System.out.println("a)gulivers travel");
	System.out.println("b)the godfather");
	System.out.println("c)panchtantra");
	System.out.println("d)the song of ice and fire");
	
	System.out.println("What was the other name of jeharys?");
	System.out.println("a) the old");
	System.out.println("b) the cruel");
	System.out.println("c) the wise");
	System.out.println("d)the idiot");
	
	System.out.println("Who is going to be the youngest person to reach the benchmarks of ambani?");
	System.out.println("a)rishu");
	System.out.println("b)rishu");
	System.out.println("c)rishu");
	System.out.println("d)rishu");
	
	
	response[0]=sc.next();
	response[1]=sc.next();
	response[2]=sc.next();
	response[3]=sc.next();
	
	int score=0;
//this for statement increments the value of score each time the user enters a right answer
	for(int i=0;i<4;i++) {
		if(response[i].equalsIgnoreCase(answer[i])) {
		score++;
	}
	}
	System.out.println("score"+score+"/4");
 }
}
