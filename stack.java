package samplearray;
import java.util.*;

public class stack {
	public static void main(String[] args) {
		Stack<String> STACK = new Stack<String>();
		 STACK.push("Welcome");
		 STACK.push("my");
		 STACK.push("friends");
		 STACK.push("Welcome");
		 
		 System.out.println("stack is"+STACK);
		 
		 STACK.pop();
		 System.out.println("stack after pop"+STACK);
		 System.out.println("Is the stack empty? " +STACK.empty());
		 System.out.println("Does the stack contains 'Friends'? " + STACK.search("friends"));
		 System.out.println("The element at the top of the stack is: " + STACK.peek());
	}

}

