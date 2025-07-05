package pps;

import java.util.HashMap;
import java.util.Scanner;

public class B1457 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n > 0) {
            int digit = n % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            n = n / 10;
        }

        int max = 0;
        for (int i = 0; i < 10; i++) {
            int index = 0;
            if(i==6 || i==9){
                index=(int)Math.ceil((map.getOrDefault(6, 0)+map.getOrDefault(9, 0))/2.0);
            } else {
                index = map.getOrDefault(i, 0);
            }
            max=Math.max(max, index);
        }

        System.out.println(max);
        scanner.close();
    }
}
