package pps;

import java.util.Scanner;

public class B116 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();
            int count = 0;
            int temp_n = n;

            while (temp_n > 0) {
                temp_n = temp_n / 2;
                count++;
            }

            for (int i = 0; i < count; i++) {
                if (n % 2 == 1) {
                    System.out.print(i + " ");
                }
                n = n / 2;
            }

            System.out.println();
        }

        s.close();
    }
}

