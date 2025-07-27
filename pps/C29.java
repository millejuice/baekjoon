package pps;

import java.util.Scanner;

public class C29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();  // 고정비용
        int b = s.nextInt();  // 가변비용
        int c = s.nextInt();  // 판매가격

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }

        s.close();
    }
}

