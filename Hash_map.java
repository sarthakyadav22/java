package hashmap;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;

	public class Hash_map {
	    public static void main(String[] args) {
	        String filename = "down.txt";
	       
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(filename));
	            String line;
	            Map<String, Integer> wordCountMap = new HashMap<>();
	           
	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split(" ");
	               
	                for (String word : words) {
	                    word = word.toLowerCase();
	                   
	                   
	                   
	                   
	                    if (!word.isEmpty()) {
	                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	           
	            reader.close();
	           
	           
	            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	           
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }
	    }
	}


