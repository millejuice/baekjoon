package pps;

import java.util.Scanner;

public class C28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a + b);
        }

        s.close();
    }
}

