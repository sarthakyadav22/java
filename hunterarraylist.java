import java.util.ArrayList;

public class hunterarraylist {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Iterating through the ArrayList
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
