import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        String pathToDelete = "file_or_directory_to_delete";
        File fileOrDir = new File(pathToDelete);
        if (fileOrDir.exists()) {
            if (fileOrDir.isDirectory()) {
                boolean deleted = fileOrDir.delete();
                if (deleted) {
                    System.out.println(pathToDelete + " directory deleted successfully.");
                } else {
                    System.out.println("Failed to delete directory.");
                }
            } else {
                boolean deleted = fileOrDir.delete();
                if (deleted) {
                    System.out.println(pathToDelete + " file deleted successfully.");
                } else {
                    System.out.println("Failed to delete file.");
                }
            }
        }
    }
}
