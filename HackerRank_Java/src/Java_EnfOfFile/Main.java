package Java_EnfOfFile;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + " " + list.get(i));
        }






    }
}