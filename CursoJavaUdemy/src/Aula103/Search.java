package Aula103;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public static void search(int[][] mat, int num) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    int x = i;
                    int y = j;

                    List<Integer> positions = savePositions(x, y);
                    printPositions(positions);
                    sidePositions(mat, positions, num);
                }
            }
        }
    }

    public static List<Integer> savePositions(int i, int j) {
        List<Integer> positions = new ArrayList<>();
        positions.add(i);
        positions.add(j);
        return positions;
    }

    public static void printPositions(List<Integer> positions) {
        System.out.println("Position: " + positions.get(0) + ", " + positions.get(1));
    }

    public static void sidePositions(int[][] mat, List<Integer> positions, int num) {
        int x = positions.get(0);
        int y = positions.get(1);

        int continuar = 1;

        for (int i = 0; i < mat.length; i++) {
            if (continuar == 0) {
                break;
            }

            for (int j = 0; j < mat[i].length; j++) {
                if (continuar == 0) {
                    break;
                }

                if (mat[i][j] == num && i == x && j == y) {
                    if (j > 0 && mat[i][j-1] != Integer.MIN_VALUE) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (j < mat[i].length-1 && mat[i][j+1] != Integer.MIN_VALUE) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i > 0 && mat[i-1][j] != Integer.MIN_VALUE) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i < mat.length-1 && mat[i+1][j] != Integer.MIN_VALUE) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }

                    continuar = 0;
                }
            }
        }
    }
}
