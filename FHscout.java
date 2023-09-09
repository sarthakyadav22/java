import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FHscout {
    public static void main(String[] args) {
        try {
            // Reading from a text file
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file");
        }
    }
}
