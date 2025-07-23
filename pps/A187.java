package pps;

import java.util.Scanner;

public class A187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 연도 입력

        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

