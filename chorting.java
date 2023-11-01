
import java.util.*;
import java.io.*;

public class chorting {
  public static void main(String args[]) {
	  //sorting in arraylist
	  ArrayList<Integer>list = new ArrayList<>();
	  list.add(1);
	  list.add(10);
	  list.add(6);
	  list.add(9);
	  list.add(999);
	  list.add(76);
	  list.add(34);
	  //list before sorting 
	  System.out.println(list);
	  //list after sorting
	  Collections.sort(list);
	  System.out.println(list);
  }
}
