package pps;

import java.util.Scanner;

public class A182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long sum = a + b + c;
        System.out.println(sum);
        sc.close();
    }
}

