package pps;

import java.util.Scanner;

public class A126 {
    public static int check(int num) {
        int count = 99;

        if (num < 100) {
            return num;
        } else {
            for (int i = 100; i <= num; i++) {
                int h = i / 100;
                int t = (i / 10) % 10;
                int o = i % 10;

                if ((h - t) == (t - o)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = check(n);
        System.out.println(result);
        sc.close();
    }
}

