package JavaLoops_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            List<Integer> list1 = new ArrayList<Integer>();

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {

                sum += Math.pow(2, j) * b;
                list1.add(sum);
            }
            list.add(list1);

        }
        for (List<Integer> x : list) {
            for (Integer element : x) {
                System.out.print(element + " ");
            }
            System.out.println();
            in.close();
        }
    }
}
