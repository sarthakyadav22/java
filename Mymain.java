package comparator;

import java.util.Comparator;
import java.util.*;

 class Mymain{
	public static void main(String[] args) {
		ArrayList<movie> al = new ArrayList<>();
		al.add(new movie(1976, "Sholey",7.8));
		al.add(new movie(2007, "star wars",8.8));
		al.add(new movie(2017, "end game",9.7));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}

public class movie implements Comparable<movie> {

    private int year;
    private String Name;
    private double rating;
    

    public int getyear() {
        return year;
    }

    public String getName() {
        return Name;
    }

    public double getrating() {
        return rating;
    }

  
    public movie(int year, String Name, double rating) {
        this.year = year;
        this.Name = Name;
        this.rating = rating;
            }

    @Override
    public int compareTo(movie m) {
        if(this.rating - m.rating>0) {
        	return -1;
        }
        else{
        	return 1;
        }
    }

    @Override
   
    public String toString() {
        return "[year=" + this.year + ", Name=" + this.Name + ", rating=" + this.rating + "]";
    }

}

