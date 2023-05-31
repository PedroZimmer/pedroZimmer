package JavaStaticInitializerBlock;

import java.util.Scanner;

public class Main {

    static int B;
    static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 1
        int b = sc.nextInt(); // 3
        if (a <= 0 || b <= 0) {

        }

        try {
            if (a <= 0 || b <= 0) {
                throw new Exception();
            } else {
                System.out.println(a * b);
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}