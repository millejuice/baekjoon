package pps;

import java.util.Scanner;

public class A148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 1;  // 단어 하나만 있을 경우 기본값

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        // 문장 처음이나 끝이 공백이면 단어 수 감소
        if (s.length() == 0) {
            count = 0;
        } else {
            if (s.charAt(0) == ' ') count--;
            if (s.charAt(s.length() - 1) == ' ') count--;
        }

        System.out.println(count);
        sc.close();
    }
}

