public class pierson {
    public static void main(String args[]) {
        // creating a multidimensional array
        int[][] mynum = { { 1, 2, 3, 4, }, { 5, 6, 7 } };
        for (int i = 0; i < mynum.length; i++) {
            for (int j = 0; j < mynum[i].length; ++j) {
                System.out.println(mynum[i][j]);
            }
        }
    }
}
