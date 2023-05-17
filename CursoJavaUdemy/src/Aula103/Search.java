package Aula103;

public class Search {

    public static boolean search(int[][] mat, int num) {

        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }


}
