package pps;

import java.util.Scanner;

public class C67 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  // 카드 개수
        int m = s.nextInt();  // 목표 값

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = 0;
        int temp = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp <= m && temp > max)
                        max = temp;
                }
            }
        }

        System.out.println(max);
        s.close();
    }
}

