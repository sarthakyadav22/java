package sample;
import java.util.ArrayList;
import java.io.*;


public class samplearraylist {
	public static void main(String[] args) throws IOException
	{
		File file = new File("sample.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		ArrayList<String> al = new ArrayList <String> ();


		
				while ((st = br.readLine()) !=null) 
				{
					String [] str = st.split(" ");
					for (String s:str) {
						
					al.add(s);}
				}
				for(int i=(al.size()-1);i>=0;i--) {
					System.out.print(al.get(i)+" ");
				}
					
}
}
