import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {
        String directoryPath = "directory_to_list";
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
