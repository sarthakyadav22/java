import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String aargs[]) {
		LinkedList <String> srt = new LinkedList<String>();
		srt.add("durango");
		srt.add("hellct");
		srt.add("redeye");
		srt.add("charger");
		srt.add("tomahawk");
		srt.add("demon");
		
		srt.remove()	;	
		System.out.println(srt);
		System.out.println(srt.size());
	    srt.remove("charger");
	    System.out.println(srt);
	    System.out.println(srt.get(1));
	    srt.add("durango");
	    System.out.println(srt);
	    srt.add(3, String);
	    System.out.println(srt);
	    System.out.println(  srt.contains("demon"));
		System.out.println(srt.indexOf("hellcat"));
		
		Object[] objectAarray = srt.toArray();

	      int length = objectAarray.length;;

	      String [] sA = new String[length];

	      for(int i =0; i < length; i++) {

	         sA[i] = (String) objectAarray[i];

	      }

	      System.out.println("Contents of the array: \n"+Arrays.toString(sA));
	      }
	}
